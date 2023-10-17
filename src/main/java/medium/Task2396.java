package medium;

import java.math.BigInteger;

public class Task2396 {
    public boolean isStrictlyPalindromic(int n) {
        for (int i = 2; i < n-1; i++) {
            String value = Integer.toString(n,i);
            int length = value.length();
            for (int j = 0; j < (length/2); j++) {
                if (value.charAt(j) != value.charAt(length-j-1)){
                    return false;
                }
            }
        }
        return true;
    }
}
