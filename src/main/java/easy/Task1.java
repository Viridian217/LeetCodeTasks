package easy;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if (map.containsKey(nums[i])){
               result = new int[]{map.get(nums[i]),i};
            }
            else {
                map.put(value, i);
            }
        }
        return result;
    }
}
