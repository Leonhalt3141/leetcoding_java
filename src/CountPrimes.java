import java.util.HashSet;
import java.util.Set;

class Solution204 {

    Set<Integer> primes;
    public int countPrimes(int n) {
        int count = 0;
        if (n < 2) return count;

        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (!isPrime[i]) continue;
            for (int j = i * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }

        for (int i = 2; i < n; i++) {
            if(isPrime[i]) count++;
        }
        return count;
    }

    private boolean isPrime(int v) {
        for (int i : primes) {
            if (v % i == 0) return false;
        }
        return true;
    }

}

public class CountPrimes {
    public static void main(String[] args) {
        Solution204 solution = new Solution204();

        int n = 2;
        System.out.println(solution.countPrimes(n));

        int n1 = 10;
        System.out.println(solution.countPrimes(n1));

        int n2 = 499979;
        System.out.println(solution.countPrimes(n2));

        int n3 = 11;
        System.out.println(solution.countPrimes(n3));
    }
}
