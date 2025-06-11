public class QuickSort2
 {
    public static void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(nums, low, high);
            quickSort(nums, low, pivotIndex - 1);
            quickSort(nums, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] nums, int low, int high) {
        int pivot = nums[high]; // Choose the last element as pivot
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            if (nums[j] <= pivot) {
                i++;
                // Swap nums[i] and nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        // Swap nums[i+1] and nums[high] (pivot)
        int temp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = temp;
        return i + 1; 
    }

    public static void QuickSort2(String[] args) {
        int[] nums1 = {5, 2, 3, 1};
        quickSort(nums1, 0, nums1.length - 1);
        System.out.println(java.util.Arrays.toString(nums1));  

        int[] nums2 = {5, 1, 1, 2, 0, 0};
        quickSort(nums2, 0, nums2.length - 1);
        System.out.println(java.util.Arrays.toString(nums2));  
    }
}