
class Solution38 {

    public String countAndSay(int n) {
        String s = "1";
        for (int i = 1; i < n; i++) {
            s = count(s);

        }
        return s;
    }

    String count(String n) {
        int size = n.length();

        StringBuilder sb = new StringBuilder();

        int count = 0;
        char c = 0;

        for (int i = 0; i < size; i++) {
            if (c == 0) {
                c = n.charAt(i);
                count++;
            } else if (c != n.charAt(i)) {
                sb.append(count);
                sb.append(c);

                c = n.charAt(i);
                count = 1;
            } else {
                count++;
            }
        }
        sb.append(count);
        sb.append(c);
        return sb.toString();
    }

}

public class CountAndSay {
    public static void main(String[] args) {
        Solution38 solution = new Solution38();

        System.out.println(solution.countAndSay(1));

        System.out.println(solution.countAndSay(4));

        System.out.println(solution.countAndSay(9));

        System.out.println(solution.countAndSay(30));
    }
}
