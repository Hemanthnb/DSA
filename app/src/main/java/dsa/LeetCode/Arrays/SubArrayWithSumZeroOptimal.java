package dsa.LeetCode.Arrays;

import java.util.*;

public class SubArrayWithSumZeroOptimal {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -5, 5, -2, -1, -2, 3 };
        Map<Integer, Integer> map = new HashMap<>();
        int prevSum = 0;
        int maxLength = 1;
        for (int i = 0; i < arr.length; i++) {
            prevSum += arr[i];
            if (prevSum == 0) {
                maxLength = Math.max(maxLength, i + 1);
            } else if (map.get(prevSum) != null) {
                maxLength = Math.max(maxLength, i - map.get(prevSum));
            } else {
                map.put(prevSum, i);
            }
        }
        System.out.println(maxLength);
    }
}
