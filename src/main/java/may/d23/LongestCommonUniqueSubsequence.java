package may.d23;

import java.util.HashMap;
import java.util.HashSet;

public class LongestCommonUniqueSubsequence {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    // sliding window
    public static int lengthOfLongestSubstring(String s) {
        int right = 0, left = 0, size = s.length();
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while (right < size) {
            char rightChar = s.charAt(right);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);

            while (map.get(rightChar) > 1) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
//                System.out.println(leftChar + " " + map.get(leftChar));
//                System.out.println(right + "-r l-" + left);
                left++;
            }

            res = Math.max(res, right - left + 1);
            right++;
        }

        return res;
    }
}
