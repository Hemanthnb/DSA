package dsa.LeetCode.Arrays;

import java.util.*;

public class PrimeFactors {
    static void iterate(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void createSieve(int arr[]) {
        for (int i = 2; i < arr.length; i++) {
            for (int j = i * i; j < arr.length; j += i) {
                if (arr[j] == j) {
                    arr[j] = i;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        n = sc.nextInt();
        int sieve[] = new int[n + 1];
        for (int i = 2; i < sieve.length; i++) {
            sieve[i] = i;
        }
        // iterate(sieve);
        createSieve(sieve);
        System.out.println();

        while (n != 1) {
            System.out.print(sieve[n] + " ");
            n = n / sieve[n];
        }
    }
}
