package module_6;

import java.util.HashSet;

public class Pair_Sum_Hash_Set {
    public static void main(String[] args) {

        int[] arr = {2, 4, 3, 5, 7, 8, 9};
        int target = 7;

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;

            if (set.contains(complement)) {
                System.out.println(complement + " + " + num + " = " + target);
            }

            set.add(num);
        }
    }
}