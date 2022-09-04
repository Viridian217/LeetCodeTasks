package medium;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Task229Test {
    private final Task229 task229 = new Task229();

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 3}, List.of(3)),
                Arguments.of(new int[]{1, 2, 3}, List.of())
                );

    }

    @ParameterizedTest
    @MethodSource("generateData")
    void majorityElementTest(int[] nums, List<Integer> expected) {
        List<Integer> result = task229.majorityElement(nums);
        Assertions.assertThat(result).isEqualTo(expected);
    }
}