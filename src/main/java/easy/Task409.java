package easy;

import java.util.Hashtable;

public class Task409 {
    public int longestPalindrome(String s) {
        Hashtable<Character, Integer> hashtable = new Hashtable<>();
        char[] charS = s.toCharArray();
        for (char aChar : charS) {
            if (hashtable.containsKey(aChar)){
                hashtable.replace(aChar,hashtable.get(aChar),hashtable.get(aChar)+1);
            }
            else {
                hashtable.put(aChar, 1);
            }
        }
        return 0;
    }
}
