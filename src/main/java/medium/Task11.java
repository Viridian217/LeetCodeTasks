package medium;

public class Task11 {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length-1;
        while (right > left) {
            int stick = Math.min(height[right], height[left]);
            int distance = right - left;
            max = Math.max(stick * distance, max);
            if (height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return max;
    }
}
