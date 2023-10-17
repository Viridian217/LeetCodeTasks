package easy.tasks_101_to_200;

import java.util.*;

public class Task169 {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                map.replace(nums[i], map.get(nums[i]), map.get(nums[i])+1);
            }
            else {
                map.put(nums[i],1);
            }
        }
        int[] max = {0};
        map.keySet().forEach(val -> {
            if (map.get(val) > nums.length/2){
                max[0] = val;
            }
        });
        return max[0];
    }
}
