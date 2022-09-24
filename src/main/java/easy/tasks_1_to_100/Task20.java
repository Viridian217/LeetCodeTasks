package easy.tasks_1_to_100;


import java.util.ArrayList;

public class Task20 {
    public boolean isValid(String s) {
        char[] ch = s.toCharArray();
        if (ch.length % 2 != 0) {
            return false;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int j = 0; j < ch.length; j++) {
            list.add(String.valueOf(ch[j]));
        }
        int size = Integer.MAX_VALUE;
        while (list.size() < size) {
            size = list.size();
            for (int i = 0; i < list.size() - 1; i++) {
                String curr = list.get(i);
                String next = list.get(i + 1);
                if (curr.equals("(") && next.equals(")") || curr.equals("{") && next.equals("}") || curr.equals("[") && next.equals("]")) {
                    list.remove(i);
                    list.remove(i);
                    i--;
                }
            }
        }
        if (list.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
