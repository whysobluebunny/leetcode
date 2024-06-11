package may.d5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef", 3));
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    // Todo Sliding window
    public static int maxVowels(String s, int k) {
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i >= k && isVowel(s.charAt(i - k)))
                count--;
            if (isVowel(s.charAt(i)))
                count++;
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
//    public static int maxVowels(String s, int k) {
////        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
//        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
//        int maxVowels = 0;
//        for (char vowel : vowels) {
//            int index = s.indexOf(vowel);
//            while (index >= 0) {
//                int counter = 1;
//                for (int i = 1; i < k && index + i < s.length(); i++) {
//                    if (isVowel(s.charAt(index + i))) {
//                        counter += 1;
//                    }
//                }
//                if (counter > maxVowels)
//                    maxVowels = counter;
//                index = s.indexOf(vowel, index + 1);
//            }
//        }
//
//        return maxVowels;
//    }
}
