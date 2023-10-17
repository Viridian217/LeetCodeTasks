package medium;

public class Task334 {
    public boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        for (int num: nums) {
            if (min >= num) min = num;
            else if (secondMin > num ) secondMin = num;
            else if (num > secondMin) return true;
        }
        return false;
    }
}
