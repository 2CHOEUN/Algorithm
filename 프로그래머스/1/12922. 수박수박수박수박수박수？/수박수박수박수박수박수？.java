import java.util.*;
class Solution {
    public String solution(int n) {
        StringBuffer answer = new StringBuffer();
        for(int i=0;i<n;i++){
            if(i%2!=0){
                answer.append("박");
            }else if(i%2==0){
                answer.append("수");
            }
        }
        return answer.toString();
    }
}