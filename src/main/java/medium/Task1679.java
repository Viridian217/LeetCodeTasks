package medium;

public class Task1679 {
    public int maxOperations(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == Integer.MIN_VALUE || nums[i] > k) {
                continue;
            }
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] == k - nums[i] && j != i) {
                        count++;
                        nums[i] = Integer.MIN_VALUE;
                        nums[j] = Integer.MIN_VALUE;
                        break;
                    }
                }
        }
        return count;
    }
}
