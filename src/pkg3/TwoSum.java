package src.pkg3;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {

        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {

            Integer diff = target - numbers[i];
            if (hash.containsKey(diff)) {
                return new int[]{hash.get(diff), i};
            }
            hash.put(numbers[i], i);
        }

        return new int[]{-1, -1};

    }

    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(ints[0] + "," + ints[1]);
    }
}