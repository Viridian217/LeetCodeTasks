package easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task392Test {
    private final Task392 task392 = new Task392();

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of("abc", "ahbgdc", true),
                Arguments.of("axc", "ahbgdc", false)
        );
    }
    @ParameterizedTest
    @MethodSource("generateData")
    void isSubsequence(String s, String t, boolean expected) {
        boolean actual = task392.isSubsequence(s,t);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}