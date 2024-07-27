package dsa.LeetCode.Arrays;

import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class SortByIncreasingFrequency {
    public static void main(String[] args) {
        int arr[] = { -1, 1, -6, 4, 5, -6, 1, 4, 1 };
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int ele : arr) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
        List<List<Integer>> frequencyMapped = new ArrayList<>();
        for (Map.Entry<Integer, Integer> iter : map.entrySet()) {
            List<Integer> al = new ArrayList<>();
            al.add(iter.getValue());
            al.add(iter.getKey());
            frequencyMapped.add(al);
        }
        System.out.println(frequencyMapped);
        Collections.sort(frequencyMapped, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> l1, List<Integer> l2) {
                if (!l1.get(0).equals(l2.get(0))) {
                    System.out.println("if " + l1.get(0) + " " + l2.get(0));
                    System.out.println("if " + l1 + " " + l2);
                    return l1.get(0).compareTo(l2.get(0));
                } else {
                    System.out.println("else " + l1.get(1) + " " + l2.get(1));
                    System.out.println("else " + l1 + " " + l2);
                    return l2.get(1).compareTo(l1.get(1));
                }
            }
        });
        System.out.println(frequencyMapped);

    }

}
