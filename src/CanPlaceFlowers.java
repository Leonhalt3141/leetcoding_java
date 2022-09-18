import java.util.Arrays;

class Solution605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int size = flowerbed.length;

        int[] flowers = new int[size + 2];
        System.arraycopy(flowerbed, 0, flowers, 1, size);

        for (int i = 1; i < size + 1; i++) {
            if (n > 0 & flowers[i - 1] == 0 && flowers[i] == 0 && flowers[i + 1] == 0) {
                flowers[i] = 1;
                n--;
            }

            if (n == 0) return true;
        }

        return false;
    }
}

public class CanPlaceFlowers {
    public static void main(String[] args) {
        Solution605 solution = new Solution605();

        System.out.println(solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));

        System.out.println(solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));

        System.out.println(solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 0, 1}, 2));

        System.out.println(solution.canPlaceFlowers(new int[]{0, 0, 1, 0, 1}, 1));

        System.out.println(solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 1, 0, 0}, 2));

        System.out.println(solution.canPlaceFlowers(new int[]{0}, 1));

        System.out.println(solution.canPlaceFlowers(new int[]{0, 0}, 2));

        System.out.println(solution.canPlaceFlowers(new int[]{0,0,0,0,0,1,0,0}, 0));
    }
}
