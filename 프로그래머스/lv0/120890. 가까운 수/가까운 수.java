import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        
        for(int i = 0; i<array.length; i++){
            if(array[i] >= n){
                int num1 = n - array[i-1];
                int num2 = array[i] - n;
            return num1 <= num2 ? array [(i-1)] : array[i];
            }
        }
        
        return array[array.length -1];
    }
}