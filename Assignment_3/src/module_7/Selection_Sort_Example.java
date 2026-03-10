package module_7;

public class Selection_Sort_Example {

        static void selectionSort(int arr[]) {
            int n = arr.length;

            for (int i = 0; i < n - 1; i++) {

                int minIndex = i;

                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }

                
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }

        public static void main(String[] args) {
            int arr[] = {29, 10, 14, 37, 13};

            selectionSort(arr);

            System.out.println("Sorted array:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

    public static class Bubble_Sort_Example {

            static void bubbleSort(int arr[]) {
                int n = arr.length;

                for (int i = 0; i < n - 1; i++) {

                    for (int j = 0; j < n - i - 1; j++) {

                        if (arr[j] > arr[j + 1]) {
                            // swap arr[j] and arr[j+1]
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
            }

            public static void main(String[] args) {
                int arr[] = {5, 1, 4, 2, 8};

                bubbleSort(arr);

                System.out.println("Sorted array:");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
        }

    public static class Insertion_Example {
            static void insertionSort(int arr[]) {
                int n = arr.length;

                for (int i = 1; i < n; i++) {
                    int key = arr[i];
                    int j = i - 1;

                   
                    while (j >= 0 && arr[j] > key) {
                        arr[j + 1] = arr[j];
                        j--;
                    }

                    arr[j + 1] = key;
                }
            }

            public static void main(String[] args) {
                int arr[] = {12, 11, 13, 5, 6};

                insertionSort(arr);

                System.out.println("Sorted array:");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
}

