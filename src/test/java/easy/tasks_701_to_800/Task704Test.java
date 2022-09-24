package easy.tasks_701_to_800;

import easy.tasks_701_to_800.Task704;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Task704Test {
    private final Task704 task704 = new Task704();

    @Test
    void searchTest() {
        int actual = task704.search(new int[]{-1,0,3,5,9,12},9);
        int expected = 4;
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}