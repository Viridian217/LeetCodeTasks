package easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task605Test {

    Task605 task605 = new Task605();

    public static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new int[]{1,0,0,0,1,0,0}, 2, true),
                Arguments.of(new int[]{1,0,0,0,1}, 1, true),
                Arguments.of(new int[]{1,0,0,0,1}, 2, false),
                Arguments.of(new int[]{1,0,0,0,0,1}, 2, false)
        );
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void canPlaceFlowers(int[] nums, int n, boolean expected) {
        boolean result = task605.canPlaceFlowers(nums,n);
        Assertions.assertThat(result).isEqualTo(expected);
    }
}