import java.util.Arrays;

class Solution338 {
    public int[] countBits(int n) {
        int[] answer = new int[n + 1];

        answer[0] = 0;

        for (int i = 1; i < n + 1; i++) {
            String bit = Integer.toBinaryString(i);
            answer[i] = bit.replaceAll("0", "").length();
        }
        return answer;
    }
    public int[] countBitsA(int num) {
        int[] result = new int[num + 1];
        Arrays.fill(result, 0);

        for(int i = 1; i <= num; i++) {
            int val = i;
            int count = 0;
            while(val > 0) {
                int isOne = val & 1;
                count += isOne;
                val = val >>> 1;
            }
            result[i] = count;
        }

        return result;
    }

    public int[] countBitsB(int n) {
        int[] answer = new int[n+1];

        for(int i=1; i<answer.length; i++) {
            answer[i] = answer[i/2] + i%2;
        }
        return answer;
    }
}

public class CountingBits {
    public static void main(String[] args) {
        Solution338 solution = new Solution338();

        int n1 = 2;
        System.out.println(Arrays.toString(solution.countBits(n1)));

        int n2 = 5;
        System.out.println(Arrays.toString(solution.countBits(n2)));
    }
}
