package dsa.LeetCode.Arrays;

public class LC_1423 {

    public static void createPrefixSum(int cardPoints[], int prefixSum_1[], int prefixSum_2[]) {
        for (int i = 1; i < cardPoints.length; i++) {
            prefixSum_1[i] = prefixSum_1[i - 1] + cardPoints[i];
            prefixSum_2[i] = prefixSum_2[i - 1] + cardPoints[cardPoints.length - i - 1];
        }

    }

    public static int maxScore(int[] cardPoints, int k) {
        int prefixSum_1[] = new int[cardPoints.length];
        int prefixSum_2[] = new int[cardPoints.length];
        prefixSum_1[0] = cardPoints[0];
        prefixSum_2[0] = cardPoints[cardPoints.length - 1];
        createPrefixSum(cardPoints, prefixSum_1, prefixSum_2);

        for (int i = 0; i < prefixSum_1.length; i++) {
            System.out.print(prefixSum_1[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < prefixSum_2.length; i++) {
            System.out.print(prefixSum_2[i] + " ");
        }
        int i = 0, j = 0, sum = 0;
        while (k > 0 && (i < prefixSum_1.length && j < prefixSum_2.length)) {
            if ((prefixSum_1[k + i] - prefixSum_1[i]) > (prefixSum_2[k + j] - prefixSum_2[j])) {
                System.out.println("\nprefixSum_1[k - 1]  " + prefixSum_1[k - 1 + i]);
                if (i == 0) {
                    sum += prefixSum_1[i];
                } else {
                    sum += prefixSum_1[i - 1];
                }
                i++;
                System.out.println("Sum " + sum);
            } else {
                System.out.println("\nprefixSum_2[k - 1] " + prefixSum_2[k - 1 + j] + " k " + k);
                if (j == 0) {
                    sum += prefixSum_2[j];
                } else {
                    sum += prefixSum_2[j - 1];
                }
                System.out.println("Sum " + sum);
                j++;
            }
            k--;
        }
        System.out.println();
        return sum;

        // int i = 0, j = 0, rightSum = 0, leftSum = 0, mainSum = 0;
        // if (cardPoints[0] > cardPoints[cardPoints.length - 1]) {
        // mainSum = cardPoints[0];
        // i++;
        // } else {
        // mainSum = cardPoints[cardPoints.length - 1];
        // j++;
        // }
        // System.out.println("i " + i + " j " + j);
        // while (i < k && j < k) {
        // leftSum += cardPoints[i];
        // rightSum += cardPoints[cardPoints.length - j - 1];
        // i++;
        // j++;
        // }
        // System.out.println("leftSum " + leftSum + " rightSum" + rightSum);
        // return mainSum + Math.max(leftSum, rightSum);
    }

    public static void main(String[] args) {
        int arr[] = { 11, 49, 100, 20, 86, 29, 72 };
        System.out.println("--------------------");
        System.out.println(maxScore(arr, 4));
    }
}