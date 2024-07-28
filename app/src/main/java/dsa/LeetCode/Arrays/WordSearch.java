package dsa.LeetCode.Arrays;

public class WordSearch {

    static boolean isWordFound(String arr[][], String word) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j].charAt(0)==word.charAt(i)){
                    
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        String arr[][] = { { "A", "B", "C", "E" }, { "S", "F", "C", "S" }, { "A", "D", "E", "E" } };
        String word = "ABCCED";

    }
}
