package easy;

import java.util.Arrays;

public class Task1768 {
    public String mergeAlternately(String word1, String word2) {

        char[] mergedRow = new char[word1.length() + word2.length()];
        char[] word1Char = word1.toCharArray();
        char[] word2Char = word2.toCharArray();
        int count = 0;
        for (int i = 0; i < word1.length() + word2.length(); i += 2) {
            if (word1Char.length <= count) {
                mergedRow[i] = word2Char[count];
                i--;
            }
            else if (word2Char.length <= count) {
                mergedRow[i] = word1Char[count];
                i--;
            }
            else {
                mergedRow[i] = word1Char[count];
                mergedRow[i + 1] = word2Char[count];
            }
            count++;
        }
        return String.valueOf(mergedRow);
    }
}
