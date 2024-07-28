package dsa.LeetCode.Arrays;

import java.util.*;

public class PairsOfSongs {
    public static void main(String[] args) {
        int time[] = { 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60,
                60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60,
                60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60,
                60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60,
                60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60,
                60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60,
                60 };
        System.out.println(time.length);
        int remainders[] = new int[time.length];
        for (int i = 0; i < time.length; i++) {
            remainders[i] = time[i] % 60;
        }
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0, count = 0;
        for (int i = 0; i < remainders.length; i++) {
            if (remainders[i] == 0) {
                count++;
            } else if (map.get(60 - remainders[i]) != null) {
                ans += map.get(60 - remainders[i]);
            }
            map.put(remainders[i], map.getOrDefault(remainders[i], 0) + 1);
        }
        System.out.println((count*(count-1))/2);
    }
}
