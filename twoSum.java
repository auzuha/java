import java.util.Arrays;

public class twoSum {
    public static int naive2sum(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target)
                    return 1;
            }
        }
        return -1;
    }

    public static int better2sum(int arr[], int target) {
        Arrays.sort(arr);
        int low = 0, high = arr.length - 1;
        while (low < high) {
            if (arr[low] + arr[high] == target)
                return 1;
            else if (arr[low] + arr[high] < target)
                low++;
            else if (arr[low] + arr[high] > target)
                high--;

        }

        return -1;
    }

    public static void main(String[] args) {
        int a[] = { 1, 24, 5, 23, 2, 1, 123 };
        int target = 29;
        System.out.println(better2sum(a, target));
        System.out.println(a[0]);

    }

}