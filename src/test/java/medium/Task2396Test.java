package medium;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2396Test {

    private final Task2396 task2396 = new Task2396();
    @Test
    void isStrictlyPalindromicTest() {
        boolean result = task2396.isStrictlyPalindromic(9);
        boolean expected = false;
        Assertions.assertThat(result).isEqualTo(expected);
    }
}