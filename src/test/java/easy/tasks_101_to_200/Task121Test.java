package easy.tasks_101_to_200;

import easy.tasks_101_to_200.Task121;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Task121Test {
    private final Task121 task121 = new Task121();

    @Test
    void maxProfitTest1() {
        int actual = task121.maxProfit(new int[]{7,1,5,3,6,4});
        int expected = 5;
        Assertions.assertThat(actual).isEqualTo(expected);
    }
    @Test
    void maxProfitTest2() {
        int actual = task121.maxProfit(new int[]{7,6,4,3,1});
        int expected = 0;
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}