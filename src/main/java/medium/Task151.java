package medium;

public class Task151 {
    public String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder(s.length());
        char[] charElements = s.toCharArray();
        StringBuilder temp = new StringBuilder();
        boolean flag = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (charElements[i] != ' ') {
                temp.append(charElements[i]);
                flag = true;
                if (i != 0) continue;
            }
            if ((charElements[i] == ' ' && flag) || (flag && i == 0)) {
                stringBuilder.append(temp.reverse()).append(" ");
                temp = new StringBuilder();
            }
            flag = false;
        }
        if (stringBuilder.length() > 0 && stringBuilder.charAt(stringBuilder.length() - 1) == ' ') {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        return String.valueOf(stringBuilder);
    }
}
