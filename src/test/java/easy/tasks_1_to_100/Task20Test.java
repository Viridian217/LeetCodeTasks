package easy.tasks_1_to_100;

import easy.tasks_1_to_100.Task20;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Task20Test {
    final Task20 task20 = new Task20();
    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of("()",true),
                Arguments.of("()[]{}",true),
                Arguments.of("(]",false),
                Arguments.of("{[]}",true),
                Arguments.of("[",false),
                Arguments.of("(([]){})",true)
        );
    }
    @ParameterizedTest
    @MethodSource("generateData")
    void isValidTest(String str, boolean expected) {
        boolean result = task20.isValid(str);
        Assertions.assertThat(result).isEqualTo(expected);
    }
}