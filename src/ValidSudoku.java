import java.util.HashMap;

class Solution38 {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!checkRow(board, i)) return false;
            if (!checkColumn(board, i)) return false;
            if (!checkSubBox(board, i)) return false;
        }
        return true;
    }

    boolean checkRow(char[][] board, int i) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char num : board[i]) {
            if (num != '.' && map.containsKey(num)) return false;
            map.put(num, 1);
        }
        return true;
    }

    boolean checkColumn(char[][] board, int col) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            char value = board[i][col];

            if (value != '.' && map.containsKey(value)) return false;
            map.put(value, 1);
        }
        return true;
    }

    boolean checkSubBox(char[][] board, int id) {
        int iMin, iMax, jMin, jMax = 0;

        if (id == 0) {
            iMin = 0;
            iMax = 3;
            jMin = 0;
            jMax = 3;
        } else if (id == 1) {
            iMin = 0;
            iMax = 3;
            jMin = 3;
            jMax = 6;
        } else if (id == 2) {
            iMin = 0;
            iMax = 3;
            jMin = 6;
            jMax = 9;
        } else if (id == 3) {
            iMin = 3;
            iMax = 6;
            jMin = 0;
            jMax = 3;
        } else if (id == 4) {
            iMin = 3;
            iMax = 6;
            jMin = 3;
            jMax= 6;
        } else if (id == 5) {
            iMin = 3;
            iMax = 6;
            jMin = 6;
            jMax = 9;
        } else if (id == 6) {
            iMin = 6;
            iMax = 9;
            jMin = 0;
            jMax = 3;
        } else if (id == 7) {
            iMin = 6;
            iMax = 9;
            jMin = 3;
            jMax = 6;
        } else {
            iMin = 6;
            iMax = 9;
            jMin = 6;
            jMax = 9;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = iMin; i < iMax; i++) {
            for (int j = jMin; j < jMax; j++) {
                char value = board[i][j];
                if (value != '.' && map.containsKey(value)) return false;
                map.put(value, 1);
            }
        }
        return true;
    }

}

public class ValidSudoku {
    public static void main(String[] args) {
        char c = 0;
        System.out.println(c);
        System.out.println('1');
        System.out.println('0');
    }
}
