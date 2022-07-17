
class Solution258 {
    public int addDigits(int num) {
        String numStr = String.valueOf(num);

        while (numStr.length() > 1) {
            num = add(num);
            numStr = String.valueOf(num);
        }
        return num;
    }

    int add(int num) {
        String numStr = String.valueOf(num);
        int value = 0;

        for (char c : numStr.toCharArray()) {
            value += Character.getNumericValue(c);
        }
        return value;
    }

    public int addDigitsA(int num){
        return (num == 0) ? 0 : 1 + (num - 1) % 9;
    }

}

public class AddDigits {
    public static void main(String[] args) {
        Solution258 solution = new Solution258();

        int num1 = 38;
        System.out.println(solution.addDigits(num1));

        int num2 = 0;
        System.out.println(solution.addDigits(num2));
    }
}
