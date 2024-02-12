package src.pkg4;

import java.util.HashMap;

public class CustomKey {
    public static void main(String[] args) {
        MyClass first = new MyClass("a", "first");
        MyClass second = new MyClass("a", "second");

        HashMap<MyClass, String> myMap = new HashMap<>();
        myMap.put(first, "someValue");
        myMap.put(second, "someOtherValue");

        System.out.println(myMap);
    }
}

class MyClass {
    private final String importantField;
    private final String anotherField;

    public MyClass(final String equalField, final String anotherField) {
        this.importantField = equalField;
        this.anotherField = anotherField;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((importantField == null) ? 0 : importantField.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "importantField='" + importantField + '\'' +
                ", anotherField='" + anotherField + '\'' +
                '}';
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final MyClass other = (MyClass) obj;
        if (importantField == null) {
            return other.importantField == null;
        } else return importantField.equals(other.importantField);
    }
}
