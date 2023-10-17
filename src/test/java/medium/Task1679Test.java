package medium;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task1679Test {

    Task1679 task1679 = new Task1679();
    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4}, 5, 2),
                Arguments.of(new int[]{3,1,3,4,3}, 6, 1),
                Arguments.of(new int[]{4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4}, 2,2)
        );

    }

    @ParameterizedTest
    @MethodSource("generateData")
    void maxOperations(int[] nums, int k, int expected) {
        int result = task1679.maxOperations(nums, k);
        Assertions.assertThat(result).isEqualTo(expected);
    }
}