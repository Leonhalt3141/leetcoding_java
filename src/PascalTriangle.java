import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangles = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> triangle = Arrays.asList(new Integer[i + 1]);
            triangle.set(0, 1);
            triangle.set(triangle.size() - 1, 1);

            if (i >= 2) {
                for (int j = 1; j < triangle.size() - 1; j++) {
                    triangle.set(j, triangles.get(i - 1).get(j - 1) + triangles.get(i - 1).get(j));
                }
            }
            triangles.add(triangle);
        }

        return triangles;
    }

    void printTriangles(List<List<Integer>> triangles) {
        for (List<Integer> triangle : triangles) {
            System.out.print(triangle.toString() + ", ");
        }
        System.out.println(" ");
    }

}

public class PascalTriangle {
    public static void main(String[] args) {
        Solution118 solution = new Solution118();

        int numRows1 = 5;
        solution.printTriangles(solution.generate(numRows1));

        int numRows2 = 1;
        solution.printTriangles(solution.generate(numRows2));

    }
}
