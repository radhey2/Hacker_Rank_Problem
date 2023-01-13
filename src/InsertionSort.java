import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        // List<Integer> arr = new ArrayList<>();
        int[] arr1 = { 12, 23, 41, 20 };
        int a = arr1.length;
        System.out.println(a);
        InsertionSort.sortArray(arr1);

    }

    public static void sortArray(int[] arr) {
        int a, b;
        int l = arr.length;
        for (int i = 0; i < l - 1; i++) {
            for (int j = 0; j < l - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    a = arr[j];
                    b = arr[j + 1];
                    arr[j + 1] = a;
                    arr[j] = b;

                }
            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
