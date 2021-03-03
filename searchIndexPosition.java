public class searchIndexPosition {
    public static int exists(int arr[], int x) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == x)
                return i;
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int x = 5;

        if (exists(arr, x) != -1) {
            System.out.println(exists(arr, x));
        } else {
            int index = 0, i = 0;
            while (i < arr.length) {
                if (x > arr[i]) {
                    index++;
                    i++;

                } else
                    break;
            }
            System.out.println(index);
        }

    }

}