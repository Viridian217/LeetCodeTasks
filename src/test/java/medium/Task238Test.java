package medium;

import easy.Task605;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task238Test {

    Task238 task238 = new Task238();

    public static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4}, new int[]{24,12,8,6}),
                Arguments.of(new int[]{-1,1,0,-3,3}, new int[]{0,0,9,0,0})
        );
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void canPlaceFlowers(int[] nums, int[] expected) {
        int[] result = task238.productExceptSelf(nums);
        Assertions.assertThat(result).isEqualTo(expected);
    }
}