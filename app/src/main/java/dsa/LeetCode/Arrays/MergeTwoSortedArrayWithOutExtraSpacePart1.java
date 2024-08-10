package dsa.LeetCode.Arrays;

public class MergeTwoSortedArrayWithOutExtraSpacePart1 {

    public static void main(String[] args) {
        int nums1[] = { 0, 2, 3, 0, 0, 0 }, nums2[] = { 1, 1, 10 };
        int j = 0;
        while (j < nums2.length) {
            int i = (nums1.length - nums2.length - 1) + j;
            int ele = nums2[j];
            while (i >= 0 && nums1[i] > ele) {
                nums1[i + 1] = nums1[i];
                i--;
            }
            nums1[i + 1] = ele;
            j++;
        }
        for (int i : nums1) {
            System.out.print(i + " ");
        }
    }

}
