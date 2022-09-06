package easy;

public class Task13 {
    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'I') {
                if (i + 1 != chars.length && chars[i + 1] == 'V') {
                    result += 4;
                    i++;
                    continue;
                } else if (i + 1 != chars.length && chars[i + 1] == 'X') {
                    result += 9;
                    i++;
                    continue;
                } else {
                    result++;
                }
            }
            if (chars[i] == 'V') {
                result += 5;
            }
            if (chars[i] == 'X') {
                if (i + 1 != chars.length && chars[i + 1] == 'L') {
                    result += 40;
                    i++;
                    continue;
                } else if (i + 1 != chars.length && chars[i + 1] == 'C') {
                    result += 90;
                    i++;
                    continue;
                } else {
                    result += 10;
                }
            }
            if (chars[i] == 'L') {
                result += 50;
            }
            if (chars[i] == 'C') {
                if (i + 1 != chars.length && chars[i + 1] == 'D') {
                    result += 400;
                    i++;
                    continue;
                } else if (i + 1 != chars.length && chars[i + 1] == 'M') {
                    result += 900;
                    i++;
                    continue;
                } else {
                    result += 100;
                }
            }
            if (chars[i] == 'D') {
                result += 500;
            }
            if (chars[i] == 'M') {
                result += 1000;
            }
        }

        return result;
    }
}
