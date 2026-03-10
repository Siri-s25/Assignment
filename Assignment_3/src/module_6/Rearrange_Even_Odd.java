package module_6;

public class Rearrange_Even_Odd {

        public static void main(String[] args) {

            int[] arr = {3, 6, 1, 8, 5, 4};
            int n = arr.length;

            int[] result = new int[n];
            int evenIndex = 0;
            int oddIndex = 1;

            for (int num : arr) {
                if (num % 2 == 0) {
                    result[evenIndex] = num;
                    evenIndex += 2;
                } else {
                    result[oddIndex] = num;
                    oddIndex += 2;
                }
            }

            System.out.println("Rearranged Array:");
            for (int num : result) {
                System.out.print(num + " ");
            }
        }
    }
