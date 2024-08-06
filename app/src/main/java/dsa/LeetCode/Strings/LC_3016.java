package dsa.LeetCode.Strings;

import java.util.*;

public class LC_3016 {

    static Map<Character, Integer> calculateFreq(String str, Map<Character, Integer> map) {
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        return map;

    }

    static int getMinimumPushes(String str) {
        Map<Character, Integer> map = new HashMap<>();
        calculateFreq(str, map);
        List<Integer> freqArray = new ArrayList<>();
        for (Map.Entry<Character, Integer> iter : map.entrySet()) {
            freqArray.add(iter.getValue());
        }
        Collections.sort(freqArray, new Comparator<Integer>() {
            @Override
            public int compare(Integer val1, Integer val2) {
                return val2.compareTo(val1);
            }
        });
        int pressCount = 1, sum = 0, i = 0;
        while (i < freqArray.size()) {

            if (i >= 8) {
                pressCount = (i / 8) + 1;
            }
            sum += (freqArray.get(i) * pressCount);
            i++;
        }
        System.out.println(sum);
        return 0;
    }

    public static void main(String[] args) {
        String s = "abcadefghhhhf";
        getMinimumPushes(s);

    }
}
