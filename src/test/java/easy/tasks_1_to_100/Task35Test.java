package easy.tasks_1_to_100;

import easy.tasks_1_to_100.Task35;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Task35Test {
    private final Task35 task35 = new Task35();
    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new int[]{1,3,5,6},5, 2),
                Arguments.of(new int[]{1,3,5,6},2, 1),
                Arguments.of(new int[]{1,3,5,6},7, 4),
                Arguments.of(new int[]{1},2,1),
                Arguments.of(new int[]{1,3},3,1)
        );
    }
    @ParameterizedTest
    @MethodSource("generateData")
    void searchInsertTest(int[] nums, int target, int expected) {
        int actual = task35.searchInsert(nums, target);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}