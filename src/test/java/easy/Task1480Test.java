package easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Task1480Test {
    private final Task1480 task1480 = new Task1480();

    @Test
    void runningSumTest() {
        int[] actual = task1480.runningSum(new int[]{1, 2, 3, 4});
        int[] expected = new int[]{1, 3, 6, 10};
        Assertions.assertThat(actual).containsExactly(expected);
    }

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4}, new int[]{1,3,6,10})
        );

    }
    @ParameterizedTest
    @MethodSource("generateData")
    void runningSumTest1(int[] nums, int[] expected) {
        int[] actual = task1480.runningSum(nums);
        Assertions.assertThat(actual).containsExactly(expected);
    }
}