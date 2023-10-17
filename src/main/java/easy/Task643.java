package easy;

import java.util.Arrays;

public class Task643 {
    public double findMaxAverage(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int tempMax = findMaxFunc(nums, k);
        int counter = 0;
        if (k == 1) {
            return Arrays.stream(nums).max().getAsInt();
        }
        if (k == nums.length) {
            return findAverageValue(tempMax,k);
        }
        for (int i = k; i < nums.length; i++) {
            if (max < tempMax) {
                max = tempMax;
            }
            if (nums.length > i) {
                tempMax = tempMax + nums[i] - nums[counter];
                counter++;
            }
            if (max < tempMax) {
                max = tempMax;
            }
        }
        return findAverageValue(max, k);
    }
    private int findMaxFunc(int[] nums, int k) {
        int max = 0;
        if (nums.length- k >= 0) {
            for (int j = 0; j < k; j++) {
                max += nums[j];
            }
        }
        return max;
    }
    private Double findAverageValue(int max, int k) {
        Double maxValue = (double) max;
        Double kValue = (double) k;
        return maxValue / kValue;
    }
}
