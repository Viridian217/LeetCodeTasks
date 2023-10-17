package easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task1071Test {
    private final Task1071 task1071 = new Task1071();
    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of("ABCABC", "ABC", "ABC"),
                Arguments.of("ABABAB", "ABAB", "AB"),
                Arguments.of("LEET", "CODE", "" ),
                Arguments.of("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXX" ),
                Arguments.of("AAAAAAAAA", "AAACCC", "" )
        );
    }
    @ParameterizedTest
    @MethodSource("generateData")
    void gcdOfStrings(String word1, String word2, String expected) {
        String actual = task1071.gcdOfStrings(word1, word2);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}