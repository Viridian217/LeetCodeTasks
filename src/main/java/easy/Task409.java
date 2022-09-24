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
        int[] count = {0};
        int[] sum = {0};
        hashtable.values().forEach(obj -> {
            if (obj % 2 == 0){
                sum[0] += obj;
            }
            else if (obj > 2) {
                sum[0] += obj - 1;
                count[0]++;
            }
            else {
                count[0]++;
            }
        });
        if (count[0] != 0){
            sum[0]++;
        }
        return sum[0];
    }
}
