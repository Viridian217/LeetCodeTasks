package easy;

public class Task1071 {
//    public String gcdOfStrings(String str1, String str2) {
//        int maxLength = Math.max(str1.length(), str2.length());
//        String str2New = String.format("%1$-" + maxLength + "s", str2);
//        String str1New = String.format("%1$-" + maxLength + "s", str1);
//        char[] str1Array = str1New.toCharArray();
//        char[] str2Array = str2New.toCharArray();
//        StringBuilder finalWord = new StringBuilder("");
//        String finalStr = "";
//        int count = 0;
//        char[] word = new char[maxLength];
//        if (!(str1 + str2).equals(str2 + str1)) return "";
//        if (str1.equals(str2)) return str1;
//        for (int i = 0; i < maxLength; i++) {
//            if (str1Array[i] == str2Array[i]) {
//                word[i] = str1Array[i];
//            } else if ((word[count] == str1Array[i] || word[count] == str2Array[i]) && word[count] != ' ') {
//                if (str1.length() > str2.length()) {
//                    finalWord.append(str1Array[i]);
//                } else if (str2.length() > str1.length()) {
//                    finalWord.append(str2Array[i]);
//                }
//                count++;
//            }
//
//        }
//        if (!finalWord.isEmpty()) {
//            int gcdLength = gcd(str1.length(), str2.length());
//            finalStr = finalWord.substring(0, gcdLength);
//        }
//        return finalStr;
//    }

    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) return "";
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
