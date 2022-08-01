package easy;

import java.util.Arrays;

public class Task35 {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > target) {
                if (nums[i] == target) {
                    return i;
                } else if (nums[i] < target) {
                    return i + 1;
                }
            } else if (nums[0] > target) {
                return 0;
            } else if (target > nums[nums.length - 1]) {
                return nums.length;
            } else if (nums[i + 1] == target) {
                return i+1;
            }
        }
        if (nums.length == 1){
            if (target > nums[0]){
                return 1;
            }
        }
        return 0;
    }
}
