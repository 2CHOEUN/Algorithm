import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int arr2[] = arr.clone();

        while(true){
            for(int i = 0; i < arr.length;i++){
                if(arr[i] >=50 && arr[i] % 2 ==0){
                    arr[i] /= 2;
                }else if(arr[i] <50 && arr[i] % 2 !=0){
                    arr[i] = arr[i] *2 +1;
                }
            }
            if(Arrays.equals(arr,arr2)){
                break;
            }
            arr2 = arr.clone();
            answer ++;
        }
        
        return answer;
    }
}