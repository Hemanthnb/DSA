package dsa.LeetCode.Arrays;

import java.util.*;

public class LeaderElement {
    public static void main(String[] args) {
        int arr[] = { 10, 4, 2, 4, 1 };
        Stack<Integer> stk = new Stack<>();
        stk.push(arr[arr.length - 1]);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= stk.peek()) {
                stk.push(arr[i]);
            }
        }
        while (!stk.isEmpty()) {
            System.out.print(stk.pop() + " ");
        }
    }
}
