package easy;

public class Task9 {
    public boolean isPalindrome(int x) {
        char[] ch = String.valueOf(x).toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ch[ch.length-1-i]){
            }
            else return false;
        }
        return true;
    }
}
