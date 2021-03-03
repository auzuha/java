public class longestPalindromicSubstring {

    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String main = "auzuha", substr = "", maxSubstr = "";
        int i, j, maxSoFar = 0;

        for (i = 0; i < main.length(); i++) {
            substr = "";
            for (j = i; j < main.length(); j++) {
                substr += main.charAt(j);
                if ((isPalindrome(substr)) && substr.length() > maxSoFar) {
                    maxSubstr = substr;
                    maxSoFar = substr.length();
                }

            }
        }
        System.out.println(maxSubstr);

    }

}
