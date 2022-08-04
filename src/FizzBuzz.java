import java.util.ArrayList;
import java.util.List;

class Solution412 {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            answer.add(evaluate(i));
        }

        return answer;
    }

    String evaluate(int i) {
        if (i % 3 == 0 && i % 5 == 0) return "FizzBuzz";
        else if (i % 3 == 0) return "Fizz";
        else if (i % 5 == 0) return "Buzz";
        else return String.valueOf(i);
    }
}

public class FizzBuzz {
    public static void main(String[] args) {
        Solution412 solution = new Solution412();

        System.out.println(solution.fizzBuzz(3));

        System.out.println(solution.fizzBuzz(5));

        System.out.println(solution.fizzBuzz(15));
    }
}
