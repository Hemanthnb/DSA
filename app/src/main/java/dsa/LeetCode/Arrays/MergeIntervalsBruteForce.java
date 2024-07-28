package dsa.LeetCode.Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class MergeIntervalsBruteForce {
    public static void main(String[] args) {
        int arr[][] = { { 1, 3 }, { 2, 6 }, { 12, 17 }, { 8, 10 }, { 15, 18 }, { 0, 8 } };
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> pairs = new ArrayList<>();
        pairs.add(arr[0][0]);
        pairs.add(arr[0][1]);
        ans.add(pairs);
        set.add(0);
        int i = ans.size() - 1, j = 1, x = 0;
        while (x < arr.length) {
            if (!set.contains(x)) {
                ArrayList<Integer> pairs_sub = new ArrayList<>();
                pairs_sub.add(arr[x][0]);
                pairs_sub.add(arr[x][1]);
                ans.add(pairs_sub);
                i = ans.size() - 1;
            }
            j = x + 1;
            while (j < arr.length) {
                if (arr[j][0] <= ans.get(i).get(1) && !set.contains(j)) {
                    if (arr[j][0] <= ans.get(i).get(0)) {
                        ans.get(i).set(0, arr[j][0]);
                    }
                    ans.get(i).set(1, Math.max(arr[j][1], ans.get(i).get(1)));
                    set.add(j);
                }
                j++;
            }
            x++;
        }
        System.out.println(ans);
    }

}
