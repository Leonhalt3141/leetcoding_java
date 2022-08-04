import java.util.HashMap;

class Solution12 {
    String[] M = {"", "M", "MM", "MMM"};
    String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    public String intToRoman(int num) {

        return M[num/1000] + C[(num%1000) /100] + X[(num%100)/10] + I[(num%10)];
    }
}

public class IntegerToRoman {
    public static void main(String[] args) {
     Solution12 solution = new Solution12();

     System.out.println(solution.intToRoman(3));
     System.out.println(solution.intToRoman(58));
     System.out.println(solution.intToRoman(1994));
    }
}
