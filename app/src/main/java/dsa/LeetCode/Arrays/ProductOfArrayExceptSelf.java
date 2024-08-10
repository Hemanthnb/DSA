package dsa.LeetCode.Arrays;

public class ProductOfArrayExceptSelf {
    static void traverse(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 3, 4, 5 };
        int prefixSum[] = new int[arr.length];
        int suffixSum[] = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] * arr[i];
        }
        suffixSum[0] = arr[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            suffixSum[i] = suffixSum[i - 1] * arr[arr.length - i - 1];
        }
        traverse(prefixSum);
        traverse(suffixSum);
        int ans[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                ans[i] = suffixSum[suffixSum.length - 2];
            } else if (i == arr.length - 1) {
                ans[i] = prefixSum[prefixSum.length - 2];
            } else {
                ans[i] = prefixSum[i - 1] * suffixSum[suffixSum.length - i - 2];
            }
        }
        traverse(ans);
    }
}