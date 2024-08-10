package dsa.LeetCode.Arrays;

import java.util.*;

public class MoveAlternatePositiveAndNegative {

    static int[] moverAlternate(int arr[]) {
        int ans[] = new int[arr.length];
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                negative.add(arr[i]);
            else
                positive.add(arr[i]);
        }
        int alternateSize = Math.min(negative.size(), positive.size());
        for (int i = 0; i < alternateSize; i++) {
            ans[2 * i] = negative.get(i);
            ans[(2 * i) + 1] = positive.get(i);
        }

        int leftOverIndex = 0;
        if (positive.size() > negative.size()) {
            leftOverIndex = (alternateSize * 2) + 1;
        } else {
            leftOverIndex = (alternateSize * 2);
        }
        for (int i = leftOverIndex; i < ans.length; i++) {
            if (positive.size() > negative.size()) {
                ans[i] = positive.get(alternateSize++);
            } else {
                ans[i] = negative.get(alternateSize++);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8 };
        arr = moverAlternate(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
