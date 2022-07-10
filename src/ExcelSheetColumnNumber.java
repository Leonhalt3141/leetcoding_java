
class Solution171 {
    public int titleToNumber(String columnTitle) {
        int size = columnTitle.length();

        int number = 0;

        for (int i = 0; i < size; i++) {
            number += columnTitle.charAt(i) - 'A' + 1;
            if (i < size - 1) number *= 26;
        }

        return number;
    }
}

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        Solution171 solution = new Solution171();

        System.out.println(solution.titleToNumber("A"));

        System.out.println(solution.titleToNumber("AB"));

        System.out.println(solution.titleToNumber("ZY"));

    }
}
