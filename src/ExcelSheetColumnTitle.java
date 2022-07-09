
class Solution168 {
    public String convertToTitle(int columnNumber) {

        StringBuilder sb = new StringBuilder();

        while (columnNumber != 0) {
            sb.append((char) ('A' + (--columnNumber) % 26));
            columnNumber /= 26;
        }

        return sb.reverse().toString();
    }
}

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        Solution168 solution = new Solution168();

        System.out.println(solution.convertToTitle(701));
        System.out.println("------------------");

        int n = 701;
        String ret = "";
        ret = (char) ('A' + (--n) % 26) + ret;
        System.out.println(ret);
        n /=26;
        ret = (char) ('A' + (--n) % 26) + ret;
        System.out.println(ret);

        System.out.println((char) ('A' + 24));

    }
}
