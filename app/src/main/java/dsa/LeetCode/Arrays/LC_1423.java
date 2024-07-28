package dsa.LeetCode.Arrays;

public class LC_1423 {

    public static int maxScore(int[] cardPoints, int k) {
        int i = 0, j = 0, rightSum = 0, leftSum = 0, mainSum = 0;
        if (cardPoints[0] > cardPoints[cardPoints.length - 1]) {
            mainSum = cardPoints[0];
            i++;
        } else {
            mainSum = cardPoints[cardPoints.length - 1];
            j++;
        }
        System.out.println("i " + i + " j " + j);
        while (i < k && j < k) {
            leftSum += cardPoints[i];
            rightSum += cardPoints[cardPoints.length - j - 1];
            i++;
            j++;
        }
        System.out.println("leftSum " + leftSum + " rightSum" + rightSum);
        return mainSum + Math.max(leftSum, rightSum);
    }

    public static void main(String[] args) {
        int arr[] = { 32, 69, 37, 79, 4, 33, 29, 33, 45, 1, 99, 90, 56, 24, 76 };
        System.out.println(maxScore(arr, 10));
    }
}