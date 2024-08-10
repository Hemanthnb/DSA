package dsa.LeetCode.Arrays;

import java.util.*;;

public class MergeTwoSortedArrayWithoutExtraSpacePart2 {
    static void swap(int arr1[], int arr2[], int i, int j) {
        int temp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;
    }

    public static void main(String[] args) {
        int nums1[] = { 4, 5, 6 }, nums2[] = { 1, 3, 10 };
        // Output 1, 3, 4, 4, 5, 6, 10
        int i = nums1.length - 1, j = 0;
        while (i >= 0 && j < nums2.length) {
            if (nums1[i] >= nums2[j]) {
                swap(nums1, nums2, i, j);
            } else {
                break;
            }
            i--;
            j++;
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for (int k = 0; k < nums1.length; k++) {
            System.out.print(nums1[k] + " ");
        }
        System.out.println();
        for (int k = 0; k < nums2.length; k++) {
            System.out.print(nums2[k] + " ");
        }

    }

}
