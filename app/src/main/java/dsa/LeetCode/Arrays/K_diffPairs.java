package dsa.LeetCode.Arrays;

import java.util.*;

public class K_diffPairs {
    public static void main(String[] args) {
        int nums[] = { 1, 3, 1, 5, 4 };
        int k = 2, i = nums.length - 1, count = 0;
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        while (i >= 0) {
            int ele = nums[i];
            if (set.contains(k + ele)) {
                count++;
                while (i > 0 && nums[i - 1] == ele) {
                    i--;
                }
            }
            set.add(ele);
            i--;
        }
        System.out.println(count);

    }
}
