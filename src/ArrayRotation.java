import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };

        int k = 3;
        ArrayRotation.rotation(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotation(int[] arr, int k) {
        if (k == 0 || k % arr.length == 0)
            return;
        k = k % arr.length;
        for (int i = 0; i < k; i++) {
            int first = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = first;
        }
    }

}
