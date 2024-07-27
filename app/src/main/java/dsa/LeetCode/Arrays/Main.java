// package dsa.LeetCode.Arrays;

// public import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;

// public class Main {
//     public static void main(String[] args) {
//         ArrayList<int[]> pairs = new ArrayList<>();

//         // Adding sample data
//         pairs.add(new int[]{1, 2});
//         pairs.add(new int[]{3, 2});
//         pairs.add(new int[]{1, 1});
//         pairs.add(new int[]{3, 3});

//         System.out.println("Before sorting:");
//         printPairs(pairs);

//         // Sort the pairs
//         Collections.sort(pairs, new Comparator<int[]>() {
//             @Override
//             public int compare(int[] pair1, int[] pair2) {
//                 if (pair1[0] != pair2[0]) {
//                     return Integer.compare(pair1[0], pair2[0]);
//                 } else {
//                     return Integer.compare(pair1[1], pair2[1]);
//                 }
//             }
//         });

//         System.out.println("After sorting:");
//         printPairs(pairs);
//     }

//     public static void printPairs(ArrayList<int[]> pairs) {
//         for (int[] pair : pairs) {
//             System.out.println("(" + pair[0] + ", " + pair[1] + ")");
//         }
//     }
// }
//  {
    
// }
