package medium;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Task334Test {

    Task334 task334 = new Task334();

    public static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4,5}, true),
                Arguments.of(new int[]{4,5,2147483647,1,2}, true),
                Arguments.of(new int[]{20,100,10,12,5,13}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void increasingTriplet(int[] nums, boolean expected) {
        boolean result = task334.increasingTriplet(nums);
        Assertions.assertThat(result).isEqualTo(expected);
    }
}