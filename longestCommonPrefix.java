import java.util.Arrays;

public class longestCommonPrefix {
    public static String[] sortNow(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].length() > arr[j + 1].length()) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static boolean allEquals(String s, String arr[]) {
        for (int i = 1; i < arr.length; i++) {
            // System.out.println(s);
            if (!s.equals(arr[i].substring(0, s.length())))
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        String words[] = { "flower", "flwow", "flight" };
        String sortedWords[] = sortNow(words);
        String answer = "";

        for (int i = sortedWords[0].length(); i > 0; i--) {
            if (allEquals(sortedWords[0].substring(0, i), sortedWords)) {
                answer = sortedWords[0].substring(0, i);
                break;
            } else
                continue;
        }

        if (answer.equals(""))
            System.out.println("\"\"");
        else
            System.out.println(answer);

    }

}
