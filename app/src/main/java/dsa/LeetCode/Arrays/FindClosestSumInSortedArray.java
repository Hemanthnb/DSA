package dsa.LeetCode.Arrays;

public class FindClosestSumInSortedArray {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 5, 13, 16, 17, 20 };
        int n = arr.length, k = 11;
        int low = 0, high = n - 1, closestDistance = Integer.MAX_VALUE, ans = arr[0];
        while (low <= high) {
            int mid = (low + high) / 2;

            if (closestDistance >= Math.abs(k - arr[mid]) && arr[mid] > ans) {
                closestDistance = Math.abs(k - arr[mid]);
                ans = arr[mid];
                System.out.println(ans);
            }
            if (arr[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
