
class Solution717 {
    public boolean isOneBitCharacter(int[] bits) {
        int size = bits.length;
        int ones = 0;
        for (int i = size - 2; i >= 0 && bits[i] != 0; i--) {
            ones++;
        }

        return ones % 2 <= 0;
    }
}

public class OnebitAndTwobitCharacters {
}
