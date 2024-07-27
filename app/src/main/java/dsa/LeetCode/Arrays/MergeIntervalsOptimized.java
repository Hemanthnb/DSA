package dsa.LeetCode.Arrays;

import java.util.*;

public class MergeIntervalsOptimized {

    static List<List<Integer>> sortIntervals(int arr[][]) {
        List<List<Integer>> interval = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < 2; j++) {
                temp.add(arr[i][j]);
            }
            interval.add(temp);
        }
        Collections.sort(interval, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> l1, List<Integer> l2) {
                if (!l1.get(0).equals(l2.get(0))) {
                    return l1.get(0).compareTo(l2.get(0));
                } else {
                    return l1.get(1).compareTo(l2.get(1));
                }
            }
        });
        return interval;
    }

    static List<List<Integer>> mergeintervals(int arr[][]) {
        List<List<Integer>> mergedinterval = new ArrayList<>();
        List<List<Integer>> sortedInterval = sortIntervals(arr);
        sortedInterval.add(mergedinterval.get(0));
        int i = 1, j = 0;
        while (i < sortedInterval.size()) {
            if (sortedInterval.get(i).get(0) <= mergedinterval.get(j).get(1)
                    && mergedinterval.get(j).get(1) <= sortedInterval.get(i).get(0)) {
                mergedinterval.get(j).set(1, sortedInterval.get(i).get(0));
            } else {
                System.out.println("Entered");
                mergedinterval.add(sortedInterval.get(i));
                j++;
            }
            i++;
        }

        return mergedinterval;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 3 }, { 2, 6 }, { 8, 9 }, { 9, 11 }, { 8, 10 }, { 2, 4 }, { 15, 18 }, { 16, 17 } };
        System.out.println(mergeintervals(arr));
    }

}
  