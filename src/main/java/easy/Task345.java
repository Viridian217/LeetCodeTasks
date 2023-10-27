package easy;

import java.util.Arrays;

public class Task345 {
    public String reverseVowels(String s) {
        int right = s.length() - 1;
        int left = 0;
        char temp = 0;
        char[] symbols = s.toCharArray();
        while (right > left) {
            if (isVowel(symbols[right]) && isVowel(symbols[left])) {
                temp = symbols[right];
                symbols[right] = symbols[left];
                symbols[left] = temp;
                right--;
                left++;
            }
            if (!isVowel(symbols[right])) right--;
            if (!isVowel(symbols[left])) left++;
        }
        return String.valueOf(symbols);
    }
    private boolean isVowel(char ch) {
        return switch (Character.toLowerCase(ch)) {
            case 'a', 'e', 'i', 'o', 'u' -> true;
            default -> false;
        };
    }
}
