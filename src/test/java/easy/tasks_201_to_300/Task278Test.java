package easy.tasks_201_to_300;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Task278Test {

    private final Task278 task278 = new Task278();
    @Test
    void firstBadVersionTest() {
        boolean result = task278.isBadVersion(68);
        int expected = 5;
        Assertions.assertThat(result).isEqualTo(expected);
    }
}