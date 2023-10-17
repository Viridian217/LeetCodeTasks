package easy.tasks_201_to_300;

public class Task278 extends VersionControl {

    public int firstBadVersion(int n) {
        int minusIndex = n - n / 2;
        int plusIndex = n - n / 2;
        while (true) {
            if (!isBadVersion(minusIndex)) {
                minusIndex -= minusIndex / 2;
            } else {
                return minusIndex;
            }
            if (!isBadVersion(plusIndex)) {
                plusIndex += plusIndex / 2;
            } else {
                return plusIndex;
            }
        }
    }
}
