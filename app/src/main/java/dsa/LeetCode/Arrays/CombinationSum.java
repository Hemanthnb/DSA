package dsa.LeetCode.Arrays;

import java.util.*;

public class CombinationSum {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5 };
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        int target = 8;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int freq = target / arr[i];
            List<Integer> combinations = new ArrayList<>();
            if (target % arr[i] == 0 || set.contains(target % arr[i])) {
                for (int j = 0; j < freq; j++) {
                    combinations.add(arr[i]);
                }
                if (set.contains(target % arr[i])) {
                    combinations.add(target % arr[i]);
                }
            }
            ans.add(combinations);
        }
        Arrays.sort(arr);
        // int ptr1=0, ptr2=arr.length
        System.out.println(ans);
    }
}
