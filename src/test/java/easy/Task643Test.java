package easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task643Test {

    Task643 task643 = new Task643();
    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new int[]{71,15,7,6,14,11,5,17,13,21},4,99.00000),
                Arguments.of(new int[]{9,7,3,5,6,2,0,8,1,9},6,5.33333),
                Arguments.of(new int[]{6,8,6,8,0,4,1,2,9,9},2,9.00000),
                Arguments.of(new int[]{4,2,1,3,3},2,3.00000),
                Arguments.of(new int[]{0,1,1,3,3},4,2.00000)
        );
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void findMaxAverage(int[] nums, int k, double expected) {
        double result = task643.findMaxAverage(nums,k);
        Assertions.assertThat(result).isEqualTo(expected);
    }
}