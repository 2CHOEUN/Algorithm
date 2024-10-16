import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(n);

        while(n != 1){
            if(n % 2 == 0){
                n = n / 2 ;
                arr.add(n);
            }else{
                n = 3 * n + 1;
                arr.add(n);
            }
        }
        
        int[] answer = new int [arr.size()];

        for(int i = 0; i < arr.size(); i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}