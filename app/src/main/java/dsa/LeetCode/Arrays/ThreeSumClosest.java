package dsa.LeetCode.Arrays;

import java.util.*;

public class ThreeSumClosest {
    public static void main(String[] args) {

        int i = 0, target = 300;
        int nums[] = { 0, 3, 97, 102, 200 };
        Set<Integer> set = new TreeSet<>();
        int closest = Integer.MAX_VALUE, ans = 0;
        while (i < nums.length - 2) {
            int j = i + 1;
            while (j < nums.length - 1) {
                int k = j + 1;
                while (k < nums.length) {
                    int val = nums[i] + nums[j] + nums[k];
                    if (Math.abs(target - val) < closest) {
                        closest = Math.abs(target - val);
                        ans = val;
                    }
                    set.add(nums[i] + nums[j] + nums[k]);
                    k++;
                }
                j++;
            }
            i++;
        }
        System.out.println(ans);
        // return ans;
    }

}
