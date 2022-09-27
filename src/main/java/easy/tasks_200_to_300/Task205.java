package easy.tasks_200_to_300;

import java.util.Hashtable;

public class Task205 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() == t.length()) {
            char[] tToChar = t.toCharArray();
            char[] sToChar = s.toCharArray();
            Hashtable<Character, Character> hashtable = new Hashtable<>();
            for (int i = 0; i < tToChar.length; i++) {
                if (!hashtable.containsKey(sToChar[i]) && !hashtable.containsValue(tToChar[i])) {
                    hashtable.put(sToChar[i], tToChar[i]);
                }
            }
            String result = "";
            for (Character character : sToChar) {
                if (hashtable.containsKey(character)) {
                    result += hashtable.get(character).toString();
                }
            }
            if (result.equals(t)) {
                return true;
            } else return false;
        } else {
            return false;
        }
    }
}
