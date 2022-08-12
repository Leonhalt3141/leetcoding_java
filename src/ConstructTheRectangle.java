import java.util.Arrays;

class Solution492 {
    public int[] constructRectangle(int area) {
        int w = (int) Math.sqrt(area);
        int l = area / w;

        while (area % w != 0) {
            w--;
            l = area / w;
        }

        return new int[]{l, w};
    }
}

public class ConstructTheRectangle {
    public static void main(String[] args) {
        Solution492 solution = new Solution492();

        System.out.println(Arrays.toString(solution.constructRectangle(4)));

        System.out.println(Arrays.toString(solution.constructRectangle(37)));

        System.out.println(Arrays.toString(solution.constructRectangle(122122)));

        System.out.println(Arrays.toString(solution.constructRectangle(2)));
    }
}
