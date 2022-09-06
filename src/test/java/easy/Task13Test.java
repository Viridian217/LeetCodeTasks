package easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task13Test {
    private final Task13 task13 = new Task13();

    static Stream<Arguments> generateData(){
        return Stream.of(
                Arguments.of("III",3),
                Arguments.of("LVIII",58),
                Arguments.of("MCMXCIV", 1994)
        );
    }
    @ParameterizedTest
    @MethodSource("generateData")
    void romanToIntTest(String symbols, int expected) {
        int result = task13.romanToInt(symbols);
        Assertions.assertThat(result).isEqualTo(expected);
    }
}