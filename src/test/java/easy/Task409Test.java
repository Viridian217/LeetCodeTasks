package easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task409Test {
    private final Task409 task409 = new Task409();

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of("abccccdd",7),
                Arguments.of("ccc",3)
        );
    }
    @ParameterizedTest
    @MethodSource("generateData")
    void longestPalindrome(String str, int expected) {
        int result = task409.longestPalindrome(str);
        Assertions.assertThat(result).isEqualTo(expected);
    }
}