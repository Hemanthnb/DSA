package dsa.LeetCode.Arrays;

import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        int arr[][] = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        List<List<Integer>> multi = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            List<Integer> pairs = new ArrayList<>();
            for (int num : arr[i]) {
                pairs.add(num);
            }
            multi.add(pairs);
        }

        Collections.sort(multi, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> list1, List<Integer> list2) {
                if (!list1.get(0).equals(list2.get(0))) {
                    return list1.get(0).compareTo(list2.get(0));
                } else {
                    return list1.get(1).compareTo(list2.get(1));
                }
            }
        });

        Set<Integer> set = new HashSet<>();
        List<List<Integer>> merged = new ArrayList<>();

        for (int i = 0; i < multi.size() - 1; i++) {
            if (set.contains(i)) {
                continue;
            } 
            for (int j = i + 1; j < multi.size(); j++) {
                if (multi.get(j).get(0) <= multi.get(i).get(1)) {
                    set.add(j);
                    if (multi.get(j).get(1) > multi.get(i).get(1)) {
                        multi.get(i).set(1, multi.get(j).get(1));
                    }

                }
            }

            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(multi.get(i).get(0));
            temp.add(multi.get(i).get(1));
            merged.add(temp);
        }

        if (!set.contains(arr.length - 1)) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(multi.get(multi.size() - 1).get(0));
            temp.add(multi.get(multi.size() - 1).get(1));
            merged.add(temp);
        }
        int mergedAns[][] = new int[merged.size()][2];
        for (int i = 0; i < merged.size(); i++) {
            mergedAns[i][0] = merged.get(i).get(0);
            mergedAns[i][1] = merged.get(i).get(1);
        }
        System.out.println(merged);

        // return mergedAns;
    }

}
