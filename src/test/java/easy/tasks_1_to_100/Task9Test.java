package easy.tasks_1_to_100;

import easy.tasks_1_to_100.Task9;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Task9Test {
    private final Task9 task9 = new Task9();

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(121, true),
                Arguments.of(-121, false),
                Arguments.of(10, false)
        );
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void isPalindromeTest(int x, boolean expected) {
        boolean result = task9.isPalindrome(x);
        Assertions.assertThat(result).isEqualTo(expected);
    }
}