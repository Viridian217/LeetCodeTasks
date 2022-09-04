package medium;

import java.util.*;

public class Task229 {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.replace(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        map.keySet().forEach(val -> {
           if (map.get(val) > nums.length/3) {
               arrayList.add(val);
           }
        });
        return arrayList;
    }
}
