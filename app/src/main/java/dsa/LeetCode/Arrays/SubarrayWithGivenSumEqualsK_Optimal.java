package dsa.LeetCode.Arrays;

import java.util.HashMap;
import java.util.Map;

public class SubarrayWithGivenSumEqualsK_Optimal {
    public static void main(String[] args) {
        // int nums[] = { 8, 2, 3, -2, 6, 1, 7 };
        int nums[] = { 1,2,1,2,1};
        int k = 3;
        // int prefixSum[] = new int[arr.length];
        // prefixSum[0] = arr[0];
        // for (int i = 1; i < arr.length; i++) {
        // prefixSum[i] = prefixSum[i - 1] + arr[i];
        // }
        // for (int iter : prefixSum) {
        // System.out.print(iter + " ");
        // }
        // System.out.println();
        // int k = 5, i = 0, maxLength = 1, start = 0, end = 0;
        // while (i < prefixSum.length) {
        // if (prefixSum[i] == k) {
        // maxLength = Math.max(maxLength, i + 1);
        // } else if (prefixSum[i] > k) {
        // int x = 0;
        // while (x < i) {
        // if (prefixSum[i] - prefixSum[x] == k) {
        // // System.out.println(x + 1 + " " + i);
        // if (maxLength < (i - x)) {
        // maxLength = i - x;
        // start = x + 1;
        // end = i;
        // }
        // // maxLength = Math.max(maxLength, i - x);
        // }
        // x++;
        // }
        // }
        // i++;
        // }
        // System.out.println(maxLength);
        // System.out.println("Start " + start + " End " + end);
        // while (i < arr.length) {
        // prefixSum += arr[i];
        // if (prefixSum == 1) {
        // } else {
        // if (prefixSum > k) {
        // int x = 0, sum = prefixSum;
        // while (x < i) {\
        // sum=sum-
        // }
        // }
        // }
        // }

        int count = 0, prefixSum = 0, i = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while (i < nums.length) {
            prefixSum += nums[i];
            if (prefixSum == k) {
                count++;
            } else if (map.get(prefixSum-k) != null) {
                count += map.get(prefixSum-k);
            } 
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
            
            i++;
        }
        System.out.println(map);
        System.out.println(count);
    }

}
