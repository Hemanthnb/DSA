package dsa.LeetCode.Arrays;

import java.util.*;

public class RansomeNote {
    public static void main(String[] args) {
        String ransomNote = "fihjjjjei";
        String magazine = "hjibagacbhadfaefdjaeaebgi";
        char ransomNoteArr[] = ransomNote.toCharArray();
        char magazineArr[] = magazine.toCharArray();

        Arrays.sort(ransomNoteArr);
        Arrays.sort(magazineArr);
        boolean flag = true;
        for (int j2 = 0; j2 < magazineArr.length; j2++) {
            System.out.print(magazineArr[j2] + " ");
        }
        System.out.println();
        for (int i = 0; i < ransomNoteArr.length; i++) {
            System.out.print(ransomNoteArr[i] + " ");
        }
        int i = 0, j = 0;

        while (i < ransomNoteArr.length && j < magazineArr.length) {
            if (magazineArr[j] > ransomNoteArr[i]) {
                flag = false;
                break;
            } else if (magazineArr[j] == ransomNoteArr[i]) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        System.out.println("flag " + flag);
    }
}
