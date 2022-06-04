
class Solution42 {


    int calculateArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;

        int left_max = 0;
        int right_max = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= left_max)
                    left_max = height[left];
                else
                    area += left_max - height[left];

                left ++;
            } else {
                if (height[right] >= right_max)
                    right_max = height[right];
                else
                    area += right_max - height[right];

                right --;
            }

        }
        return area;

    }

}

public class TrappingRainWater {
    public static void main(String[] args) {
        Solution42 solution = new Solution42();

        int[] height = new int[]{4,2,0,3,2,5};

        System.out.println(solution.calculateArea(height));

    }
}
