import java.util.*;
class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right;i++){
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    arr.add(j);
                }
            }
            if(arr.size() % 2 ==0){
                answer += i;
            }else{
               answer -= i;

            }
        }
        return answer;
    }
}