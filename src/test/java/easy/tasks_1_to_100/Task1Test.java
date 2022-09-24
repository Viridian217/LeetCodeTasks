package easy.tasks_1_to_100;

import easy.tasks_1_to_100.Task1;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Task1Test {
    private final Task1 task1 = new Task1();

    static Stream<Arguments> generateData(){
        return Stream.of(
                Arguments.of(new int[]{2,7,11,15},9, new int[]{0,1}),
                Arguments.of(new int[]{3,2,4},6, new int[]{1,2}),
                Arguments.of(new int[]{3,3},6, new int[]{0,1})
        );
    }
    @ParameterizedTest
    @MethodSource("generateData")
    void twoSumTest(int[] nums, int target, int[] expected) {
        int[] result = task1.twoSum(nums,target);
        Assertions.assertThat(result).containsExactly(expected);
    }
}