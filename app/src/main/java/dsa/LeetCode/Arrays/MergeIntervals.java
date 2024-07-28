package dsa.LeetCode.Arrays;

import java.util.ArrayList;
import java.util.HashSet;

import org.checkerframework.checker.units.qual.s;

public class MergeIntervals {
    public static void main(String[] args) {
        int arr[][] = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 }, { 0, 8 } };
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        // ArrayList<Integer> pairs = new ArrayList<>();
        // pairs.add(arr[0][0]);
        // pairs.add(arr[0][1]);
        // ans.add(pairs);

        for (int i = 0; i < ans.size(); i++) {
            if (!set.contains(i)) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j][0] <= arr[i][1]) {
                        if (arr[j][0] <= arr[i][0]) {
                            arr[i][0] = arr[j][0];
                            arr[i][1] = Math.max(arr[j][1], arr[i][1]);
                        } else {
                            arr[i][1] = Math.max(arr[j][1], arr[i][1]);
                        }
                        set.add(j);
                    }
                }
            }
        }
        System.out.println(set);
        for (int index = 0; index < arr.length; index++) {
            for (int i = 0; i < arr[index].length; i++) {
                System.out.print(arr[index][i] + " ");
            }
            System.out.println();
        }
        // System.out.println(ans);
    }

}
