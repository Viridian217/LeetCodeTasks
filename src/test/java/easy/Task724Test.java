package easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Task724Test {
    private final Task724 task724 = new Task724();
    static Stream<Arguments> generateData(){
        return Stream.of(
                Arguments.of(new int[]{1,7,3,6,5,6},3),
                Arguments.of(new int[]{1,2,3},-1),
                Arguments.of(new int[]{2,1,-1},0)
        );
    }
    @ParameterizedTest
    @MethodSource("generateData")
    void pivotIndexTest(int[] nums, int expected) {
        int actual = task724.pivotIndex(nums);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}