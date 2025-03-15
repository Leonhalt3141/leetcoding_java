public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        String firstStr = strs[0];

        int size = firstStr.length();
        String result = "";

        for (int i = 0; i < size; i++) {
            String referStr = firstStr.substring(0, i + 1);

            for (String checkStr : strs) {
                int endIndex = Math.min(i + 1, checkStr.length());
                String check = checkStr.substring(0, endIndex);
                if (!referStr.equals(check)) return result;
            }
            result = referStr;
        }
        return result;

    }

    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};

        System.out.println(longestCommonPrefix(strs1));

        String[] strs2 = {"dog", "racecar", "car"};

        System.out.println(longestCommonPrefix(strs2));

        String[] strs3 = {"a"};
        System.out.println(longestCommonPrefix(strs3));

        String[] strs4 = {"flower","flower","flower","flower"};
        System.out.println(longestCommonPrefix(strs4));

        String[] strs5 = {"ab", "a"};
        System.out.println(longestCommonPrefix(strs5));

        String[] strs6 = {"a", "b"};
        System.out.println(longestCommonPrefix(strs6));
    }

}
