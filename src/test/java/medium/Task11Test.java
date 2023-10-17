package medium;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task11Test {

    Task11 task11 = new Task11();

    public static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new int[]{1,8,6,2,5,4,8,3,7}, 49),
                Arguments.of(new int[]{1,1},1)
        );
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void maxArea(int[] nums, int expected) {
        int result = task11.maxArea(nums);
        Assertions.assertThat(result).isEqualTo(expected);
    }
}