package dsa.LeetCode.Arrays;

import java.util.*;

public class ThreeSumClosestOptimal {
    public static void main(String[] args) {
        int i = 0, target = 1;
        int nums[] = { -1, 2, 1, -4 };
        Arrays.sort(nums);
        int closest = Integer.MAX_VALUE, ans = 0;
        while (i < nums.length - 2) {
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int val = nums[i] + nums[j] + nums[k];
                if (Math.abs(target - val) < closest) {
                    closest = Math.abs(target - val);
                    ans = val;
                    j++;
                }

                if (val > target) {
                    k--;
                } else {
                    j++;
                }
            }
            i++;
        }
        System.out.println(ans);
    }
}
