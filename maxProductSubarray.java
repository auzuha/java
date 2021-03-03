package algorithms;

public class maxProductSubarray {
    public static void main(String[] args) {
        int arr[] = { -2, 0, -1 };
        int n = arr.length, temp, maxSoFar = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            temp = 1;
            for (int j = i; j < n; j++) {
                temp *= arr[j];
                if (temp > maxSoFar)
                    maxSoFar = temp;
            }
        }

        System.out.println(maxSoFar);
    }

}
