package module_7;

 public class Binary_Search_Iterative {


        public static int binarySearch(int arr[], int key) {
            int left = 0;
            int right = arr.length - 1;

            while (left <= right) {
                int mid = (left + right) / 2;

                if (arr[mid] == key)
                    return mid;

                else if (arr[mid] < key)
                    left = mid + 1;
                else
                    right = mid - 1;
            }

            return -1;
        }

        public static void main(String[] args) {
            int arr[] = {10, 20, 30, 40, 50, 60};
            int key = 40;

            int result = binarySearch(arr, key);

            if (result != -1)
                System.out.println("Element found at index: " + result);
            else
                System.out.println("Element not found");
        }
    }

class BinarySearchRecursive {

    public static int binarySearch(int arr[], int left, int right, int key) {

        if (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == key)
                return mid;

            if (arr[mid] > key)
                return binarySearch(arr, left, mid - 1, key);

            return binarySearch(arr, mid + 1, right, key);
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60};
        int key = 50;

        int result = binarySearch(arr, 0, arr.length - 1, key);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }
}