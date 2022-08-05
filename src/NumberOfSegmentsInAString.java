
class Solution434 {
    public int countSegments(String s) {

        int size = s.length();
        if (size == 0) return 0;
        int count = 0;

        boolean segment = false;

        for (int i = 0; i < size; i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                if (!segment) {
                    count++;
                    segment = true;
                }
            } else {
                segment = false;
            }

        }
        return count;
    }
}

public class NumberOfSegmentsInAString {
    public static void main(String[] args) {
        Solution434 solution = new Solution434();

        System.out.println(solution.countSegments("Hello, my name is John"));

        System.out.println(solution.countSegments("Hello"));

        System.out.println(solution.countSegments(", , , ,        a, eaefa"));
    }
}

