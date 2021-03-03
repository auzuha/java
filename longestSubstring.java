class Solution {

    public static int stringHasChar(String substr, char ch) {
        for (int i = 0; i < substr.length(); i++) {
            if (substr.charAt(i) == ch) {
                return -22;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String str = "pwwkew", substr;
        int len = str.length(), maxSoFar = 0;
        for (int i = 0; i < len; i++) {
            substr = "";
            for (int j = i; j < len; j++) {
                if ((stringHasChar(substr, str.charAt(j)) == -22))
                    break;
                substr += str.charAt(j);
                // System.out.println(substr);
                maxSoFar = maxSoFar > substr.length() ? maxSoFar : substr.length();
            }
        }
        System.out.println(maxSoFar);

    }

}
