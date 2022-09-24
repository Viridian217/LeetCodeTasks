package easy.tasks_701_to_800;

import java.util.Arrays;

public class Task704 {
    public int search(int[] nums, int target) {
        if (Arrays.stream(nums).anyMatch(x -> x == target)) {
            return Arrays.binarySearch(nums,target);
        }
        else {
            return -1;
        }
    }
}
