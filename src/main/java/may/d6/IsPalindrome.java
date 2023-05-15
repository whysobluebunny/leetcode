package may.d6;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
    }

    public static boolean isPalindrome(int x) {
        String xStr = String.valueOf(x);
        int size = xStr.length() - 1;
        for (int i = 0; i <= size / 2; i++)
            if (xStr.charAt(i) != xStr.charAt(size - i))
                return false;
        return true;
    }
}
