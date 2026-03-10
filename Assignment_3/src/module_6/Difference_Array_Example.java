package module_6;

public class Difference_Array_Example {
        public static void main(String[] args) {

            int n = 5;
            int[] arr = {0, 0, 0, 0, 0};
            int[] diff = new int[n];

            // Initialize difference array
            diff[0] = arr[0];
            for (int i = 1; i < n; i++) {
                diff[i] = arr[i] - arr[i - 1];
            }

            // Range Updates
            rangeUpdate(diff, 1, 3, 5);  // add 5 from index 1 to 3
            rangeUpdate(diff, 2, 4, 2);  // add 2 from index 2 to 4

            // Reconstruct final array using prefix sum
            arr[0] = diff[0];
            for (int i = 1; i < n; i++) {
                arr[i] = arr[i - 1] + diff[i];
            }

            // Print updated array
            System.out.println("Final Array:");
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }

        static void rangeUpdate(int[] diff, int L, int R, int val) {
            diff[L] += val;
            if (R + 1 < diff.length) {
                diff[R + 1] -= val;
            }
        }
    }

