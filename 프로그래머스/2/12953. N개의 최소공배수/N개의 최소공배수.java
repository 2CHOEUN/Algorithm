import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int min = 0;
        long max = 1;
        
        for(int i=0;i<arr.length;i++){
            max *= arr[i];
            min = arr[i];
        }
        
        for(int i=min;i<=max;i+=min){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(i % arr[j] == 0){
                    count ++;
                }
            }
            if(count == arr.length){
                answer = i;
                break;
            }
        }
        return answer;
    }
}