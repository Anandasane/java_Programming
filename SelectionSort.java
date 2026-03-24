public class SelectionSort {
    
    public static int[] selectionSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap
            int temp = nums[i];
            nums[i] = nums[minIdx];
            nums[minIdx] = temp;
        }
        return nums;
    }

    // Example usage
    public static void main(String[] args) {
        int[] nums1 = {7, 4, 1, 5, 3};
        int[] nums2 = {5, 4, 4, 1, 1};
        selectionSort(nums1);
        selectionSort(nums2);
        System.out.println(java.util.Arrays.toString(nums1)); // [1, 3, 4, 5, 7]
        System.out.println(java.util.Arrays.toString(nums2)); // [1, 1, 4, 4, 5]
    }
}   

