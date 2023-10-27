package medium;

import java.util.Arrays;

public class Task238 {

    public int[] productExceptSelf(int[] nums) {
        int[] multiplyNums = new int[nums.length];
        int temp = 1;
        for (int i = 0; i < nums.length; i++) {
            multiplyNums[i] = temp;
            temp *= nums[i];
        }
        temp = 1;
        for (int i = nums.length-1; i >=0; i--) {
            if (i == 0) {
                multiplyNums[i] = temp;
            }
            else {
                multiplyNums[i] *= temp;
                temp *= nums[i];
            }
        }
        return multiplyNums;
    }


    public int[] productExceptSelfAlternative(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] temp = new int[nums.length];
        int count = 0;
        Arrays.fill(temp, 1);

        while (count != nums.length) {
            if (right - count >= 1) {
                temp[count] *= nums[right];
                right--;
            }
            if (count - left >= 1) {
                temp[count] *= nums[left];
                left++;
            }
            if (right - count == 0 && count - left == 0) {
                right = nums.length - 1;
                left = 0;
                count++;
            }
        }
        return temp;
    }
}
