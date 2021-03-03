public class findTheDifference {
    public static void main(String[] args) {
        String s1 = "auz";
        String s2 = "azuc";
        for (int i = 0; i < s2.length(); i++) {
            if (s1.indexOf(s2.charAt(i)) == -1) {
                System.out.println(s2.charAt(i));
            }
        }
    }

}
