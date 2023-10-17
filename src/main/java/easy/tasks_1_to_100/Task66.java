package easy.tasks_1_to_100;

public class Task66 {
    public int[] plusOne(int[] digits) {
        int[] mass = new int[digits.length + 1];
        int count = 0;
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
        } else {
            for (int i = 0; i < digits.length; i++) {

            }


            return new int[]{};
        }
        return mass;
    }
}