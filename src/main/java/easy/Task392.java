package easy;

public class Task392 {
    public boolean isSubsequence(String s, String t) {
        char[] sCharMass = s.toCharArray();
        int j = 0;
        for (int i = 0; i < t.length(); i++) {
            char tChar = t.charAt(i);
            if (j < sCharMass.length && tChar == sCharMass[j]){
                j++;
            }
        }
        return j == sCharMass.length;
    }
}
