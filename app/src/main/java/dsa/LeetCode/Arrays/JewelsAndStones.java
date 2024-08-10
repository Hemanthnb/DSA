
import java.util.*;

public class JewelsAndStones {
    public static void main(String[] args) {
        String stones = "aAAbbbb";
        String jewels = "aA";
        char stonesArray[] = stones.toCharArray();
        char jewelsArray[] = jewels.toCharArray();
        Arrays.sort(stonesArray);
        Arrays.sort(jewelsArray);
        int i = 0, j = 0, count = 0;
        while (i < jewelsArray.length && j < stonesArray.length) {
            if (jewelsArray[i] == stonesArray[j]) {
                count++;
                j++;
            } else if (jewelsArray[i] > stonesArray[j]) {
                j++;
            } else {
                i++;
            }
            System.out.println("Infinite");
        }
        System.out.println(count);

    }
}
