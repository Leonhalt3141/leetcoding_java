
class Solution11 {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;

        int area;
        int maxArea = 0;
        int leftH;
        int rightH;
        int width;

        while (start < end) {
            leftH = height[start];
            rightH = height[end];

            width = end - start;
            area = (leftH >= rightH) ? rightH * width : leftH * width;

            maxArea = Integer.max(area, maxArea);

            if (leftH <= rightH) start++;
            else end--;
        }

        return maxArea;
    }
}

public class ContainerWithMostWater {
    public static void main(String[] args) {
        Solution11 solution = new Solution11();

        int[] height1 = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(solution.maxArea(height1));

        int[] height2 = new int[]{1,1};
        System.out.println(solution.maxArea(height2));
    }
}
