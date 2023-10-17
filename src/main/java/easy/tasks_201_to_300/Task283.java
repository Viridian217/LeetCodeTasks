package easy.tasks_201_to_300;

public class Task283 {
    public void moveZeroes(int[] nums) {
        int currPosition = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[currPosition] = nums[i];
                if (currPosition != i) {
                    nums[i] = 0;
                }
                currPosition++;
            }
        }
    }
}