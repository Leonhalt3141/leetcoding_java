public class FindTheIndexOfTheFirstOccurenceInAString {
    public static int strStr(String haystack, String needle) {
        int needleSize = needle.length();

        for (int i = 0; i <= haystack.length() - needleSize; i++) {
            String slicedStr = haystack.substring(i, i + needleSize);

            if (slicedStr.equals(needle)) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));

        System.out.println(strStr("leetcode", "leeto"));

        System.out.println(strStr("hello", "ll"));

        System.out.println(strStr("a", "a"));
    }
}
