import java.util.Objects;

class Solution482 {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) if (c !='-') sb.append(c);
        int size = sb.length();
        if (size == 0) return "";

        boolean exact = (size % k == 0);
        StringBuilder answer = new StringBuilder();
        int index = 0;
        if (!exact) {
            while (index < size % k && index < size) {
                answer.append(sb.substring(index, index+1).toUpperCase());
                index++;
            }
            answer.append('-');
        }

        int kcount = 0;
        while (index < size) {
            answer.append(sb.substring(index, index+1).toUpperCase());
            kcount++;
            if (kcount == k) {
                answer.append('-');
                kcount = 0;
            }
            index++;
        }
        return answer.substring(answer.length() - 1).equals("-") ? answer.substring(0, answer.length() - 1).toString() : answer.toString();
    }
}

public class LicenseKeyFormatting {
    public static void main(String[] args) {
        Solution482 solution = new Solution482();

        System.out.println(solution.licenseKeyFormatting("5F3Z-2e-9-w", 4));

        System.out.println(solution.licenseKeyFormatting("2-5g-3-J", 2));
    }
}
