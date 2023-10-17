package easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task1768Test {

    private final Task1768 task1768 = new Task1768();
    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of("abc", "pqr", "apbqcr"),
                Arguments.of("ab", "pqrs", "apbqrs"),
                Arguments.of("abcd", "pq", "apbqcd" ),
                Arguments.of("", "fdsfsfd", "fdsfsfd")
        );
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void mergeAlternately(String word1, String word2, String expected) {
        String actual = task1768.mergeAlternately(word1, word2);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}