package easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task169Test {
    private final Task169 task169 = new Task169();
    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new int[]{3,2,3},3),
                Arguments.of(new int[]{2,2,1,1,1,2,2},2),
                Arguments.of(new int[]{3,3,4},3),
                Arguments.of(new int[]{6,6,6,7,7},6)
        );
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void majorityElementTest(int[] nums, int expected) {
        int result = task169.majorityElement(nums);
        Assertions.assertThat(result).isEqualTo(expected);
    }
}