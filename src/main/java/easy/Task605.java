package easy;

public class Task605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean temp = false;
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) temp = true;
            else {
                if (flowerbed.length - 1 > i && flowerbed[i] == 0 && flowerbed[i + 1] == 0 && !temp) {
                    count++;
                    temp = true;
                } else if (flowerbed.length - 1 == i && !temp) {
                    count++;
                } else {
                    temp = false;
                }
            }
        }
        return count >= n;
    }
}
