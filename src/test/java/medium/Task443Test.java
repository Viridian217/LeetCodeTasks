package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task443Test {

    Task443 task443 = new Task443();

    @Test
    void compress() {
        char[] input = new char[]{'a'};
        int expected = 1;
        int result = task443.compress(input);
        System.out.println(input);
        System.out.println(expected);
        System.out.println(result);
        Assertions.assertEquals(result, expected);
    }
}