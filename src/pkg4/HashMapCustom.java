package src.pkg4;

class HashMapCustom<K, V> {

    private final Entry<K, V>[] table;
    private final int capacity = 4;

    public HashMapCustom() {
        table = new Entry[capacity];
    }

    public void put(K newKey, V data) {
        if (newKey == null)
            return;

        int hash = hash(newKey);

        Entry<K, V> newEntry = new Entry<>(newKey, data, null);


        if (table[hash] == null) {
            table[hash] = newEntry;
        } else {
            Entry<K, V> previous = null;
            Entry<K, V> current = table[hash];

            while (current != null) {
                if (current.key.equals(newKey)) {
                    newEntry.next = current.next;
                    if (previous == null) {
                        table[hash] = newEntry;
                    } else {
                        previous.next = newEntry;
                    }
                    return;
                }
                previous = current;
                current = current.next;
            }
            assert previous != null;
            previous.next = newEntry;
        }
    }

    public V get(K key) {
        int hash = hash(key);
        if (table[hash] != null) {
            Entry<K, V> temp = table[hash];
            while (temp != null) {
                if (temp.key.equals(key))
                    return temp.value;
                temp = temp.next;
            }
        }
        return null;
    }

    public boolean remove(K deleteKey) {

        int hash = hash(deleteKey);

        if (table[hash] != null) {
            Entry<K, V> previous = null;
            Entry<K, V> current = table[hash];

            while (current != null) {
                if (current.key.equals(deleteKey)) {
                    if (previous == null) {
                        table[hash] = table[hash].next;
                    } else {
                        previous.next = current.next;
                    }
                    return true;
                }
                previous = current;
                current = current.next;
            }
        }
        return false;

    }

    public void display() {

        for (int i = 0; i < capacity; i++) {
            if (table[i] != null) {
                Entry<K, V> entry = table[i];
                while (entry != null) {
                    System.out.print("{" + entry.key + "=" + entry.value + "}" + " ");
                    entry = entry.next;
                }
            }
        }

    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        public Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}
