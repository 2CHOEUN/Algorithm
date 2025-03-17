import java.util.*;
class Solution {
    public int solution(int[] array) {
       Arrays.sort(array);
        int maxCount = 0;
        int currentCount = 1;
        int mode = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    mode = array[i - 1];
                } else if (currentCount == maxCount) {
                    mode = -1;
                }
                currentCount = 1;
            }
        }
        if (currentCount > maxCount) {
            mode = array[array.length - 1];
        } else if (currentCount == maxCount) {
            mode = -1;
        }
        return mode;
    }
}