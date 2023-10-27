package medium;

public class Task443 {
    public int compress(char[] chars) {
        int tempCount = 0;
        int count = 0;
        int index = 1;
        char temptemp = ' ';
        if (chars.length == 1) return 1;
        char temp = chars[0];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == temp) {
                tempCount++;
            }
            if (i == chars.length - 1) {
                temptemp = temp;
            }
            if (chars[i] != temp || i == chars.length - 1) {
                char[] charCounter = String.valueOf(tempCount).toCharArray();
                if (tempCount > 1 && tempCount < 10) {
                    count += 2;
                    chars[index - 1] = temp;
                    for (char c : charCounter) {
                        chars[index] = c;
                        index++;
                    }
                } else if (tempCount >= 10 && tempCount < 100) {
                    count += 3;
                    chars[index - 1] = temp;
                    for (char c : charCounter) {
                        chars[index] = c;
                        index++;
                    }
                } else if (tempCount >= 100 && tempCount < 1000) {
                    count += 4;
                    chars[index - 1] = temp;
                    for (char c : charCounter) {
                        chars[index] = c;
                        index++;
                    }
                } else if (tempCount >= 1000) {
                    count += 5;
                    chars[index - 1] = temp;
                    for (char c : charCounter) {
                        chars[index] = c;
                        index++;
                    }
                } else if (tempCount == 1) {
                    chars[index - 1] = temp;
                    count++;
                }
                temp = chars[i];
                index++;
                tempCount = 1;
            }
            if (i == chars.length - 1 && temptemp != temp && index - 1 < chars.length) {
                chars[index - 1] = temp;
                count++;
            }
        }
        return count;
    }
}
