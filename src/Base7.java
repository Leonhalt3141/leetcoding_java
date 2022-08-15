
class Solution504 {
    public String convertToBase7(int num) {
        if (Math.abs(num) < 7) return String.valueOf(num);

        StringBuilder sb = new StringBuilder();
        int divided = num;

        while (Math.abs(divided) >= 7) {
            sb.insert(0, Math.abs(divided % 7));
            divided /= 7;
        }
        sb.insert(0, divided);

        return sb.toString();
    }
}

public class Base7 {
    public static void main(String[] args) {
        Solution504 solution = new Solution504();

        System.out.println(solution.convertToBase7(100));
        System.out.println(solution.convertToBase7(-7));

        System.out.println(solution.convertToBase7(-8));
    }
}
