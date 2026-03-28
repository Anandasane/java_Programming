public class ReverseArray {
    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 5};
        reverse(arr);
        // Output: [5, 6, 2, 3, 4, 1]
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}   