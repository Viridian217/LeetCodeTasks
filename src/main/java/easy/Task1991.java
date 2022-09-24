package easy;

public class Task1991 {
    public int findMiddleIndex(int[] nums) {
        int pivotIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            int currentSumRight = 0;
            int currentSumLeft = 0;
            for (int j = pivotIndex + 1; j < nums.length; j++) {
                currentSumRight += nums[j];
            }
            for (int n = 0; n < pivotIndex; n++){
                currentSumLeft += nums[n];
            }
            if (currentSumLeft == currentSumRight) {
                return pivotIndex;
            } else {
                pivotIndex++;
            }
        }
        return -1;
    }
}
