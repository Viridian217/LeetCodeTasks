package medium;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task151Test {

    Task151 task151  = new Task151();

    public static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of( "the sky is blue", "blue is sky the"),
                Arguments.of( "  hello world  ", "world hello"),
                Arguments.of( "a good   example", "example good a")
        );
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void reverseWords(String str, String expected) {
        String result = task151.reverseWords(str);
        Assertions.assertThat(result).isEqualTo(expected);
    }
}