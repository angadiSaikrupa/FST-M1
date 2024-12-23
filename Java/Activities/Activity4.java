package Activity2;

import java.util.Arrays;

public class Activity4 {

    public static void main(String[] args) {
        Activity4 actObj = new Activity4();
        int[] nums = {10, 9, 47, 210, 24, 5, 26};

        actObj.insertionSort(nums);

        System.out.println("Sorted array: " + Arrays.toString(nums));
    }

    public void insertionSort(int[] nums) {
        int size = nums.length;
        for (int i = 1; i < size; i++) {
            int key = nums[i];
            int j = i - 1;

            // Correct the condition to j >= 0
            while (j >= 0 && key < nums[j]) {
                nums[j + 1] = nums[j];
                --j;
            }
            nums[j + 1] = key;
        }
    }
}
