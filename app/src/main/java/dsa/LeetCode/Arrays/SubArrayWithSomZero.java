package dsa.LeetCode.Arrays;

public class SubArrayWithSomZero {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -5, 5, -2, -1, -2, 3 };
        int length = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            int sum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
                if (sum == 0) {
                    System.out.println("Length = " + (j - i+1) + " " + i + " " + (j));
                    length = Math.max(length, j - i+1);
                }
                
            }
        }
        System.out.println("MaxLength = " + length);

    }
}
