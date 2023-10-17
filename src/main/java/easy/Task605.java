package easy;

public class Task605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean result = false;
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) result = true;
            if (flowerbed[i] == 0) {
                if (flowerbed.length - 1 > i && flowerbed[i] == 0 && flowerbed[i + 1] == 0 && !result) {
                    flowerbed[i] = 1;
                    count++;
                    result = true;
                }   else if (flowerbed.length - 1 == i && !result) {
                    count++;
                }
                else {
                    result = false;
                }
            }
        }
        return count >= n;
    }
}
