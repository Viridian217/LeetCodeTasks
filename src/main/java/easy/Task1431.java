package easy;

import java.util.*;

public class Task1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> booleanList = new ArrayList<>(candies.length);
        if (candies.length == 0) return booleanList;
        int max = Arrays.stream(candies).max().getAsInt();
        for (int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= max) {
                booleanList.add(true);
            }
            else {
                booleanList.add(false);
            }
        }

        return booleanList;
    }
}
