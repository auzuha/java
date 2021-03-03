import java.util.Arrays;

public class threeSum {

    public static int naive3sum(int arr[], int target) {
        int closest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (Math.abs(arr[i] + arr[j] + arr[k] - target) < closest) {
                        closest = (arr[i] + arr[j] + arr[k]);

                    }
                }
            }
        }

        return closest;
    }

    public static void betterThreeSum(int arr[], int target) {
        int sol[][] = new int[10][10];
        int row = 0;
        Arrays.sort(arr);
        int low = 0, high = arr.length - 1;
        for (int i = 0; i <= arr.length - 3; i++) {
            low = i + 1;
            high = arr.length - 1;
            while (low < high) {
                if ((arr[i] + arr[low] + arr[high]) == target) {
                    sol[row][0] = arr[i];
                    sol[row][1] = arr[low];
                    sol[row][2] = arr[high];
                    row++;
                    low++;
                    high--;
                } else if ((arr[i] + arr[low] + arr[high]) < target)
                    low++;
                else if ((arr[i] + arr[low] + arr[high]) > target)
                    high--;
            }

        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sol[i][j] + " ");
            }
            System.out.print("\n");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 6, 0, 0 };
        int target = 6;
        betterThreeSum(arr, target);

    }

}
