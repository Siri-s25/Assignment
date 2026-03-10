package module_7;

public class Quick_Sort_Example {

        int partition(int arr[], int low, int high) {

            int pivot = arr[high];   // choose last element as pivot
            int i = low - 1;

            for (int j = low; j < high; j++) {

                if (arr[j] < pivot) {
                    i++;

                    // swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            // place pivot in correct position
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            return i + 1;
        }

        void quickSort(int arr[], int low, int high) {
            if (low < high) {

                int pi = partition(arr, low, high);

                quickSort(arr, low, pi - 1);
                quickSort(arr, pi + 1, high);
            }
        }

        public static void main(String args[]) {

            int arr[] = {10, 7, 8, 9, 1, 5};

            Quick_Sort_Example obj = new Quick_Sort_Example();
            obj.quickSort(arr, 0, arr.length - 1);

            System.out.println("Sorted array:");

            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");
        }
    }

