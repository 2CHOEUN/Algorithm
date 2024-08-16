import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        
        for(int i=0;i<indices.length;i++){
            for(int j=0;j<indices.length;j++){
                if(indices[i]>indices[j]){
                    int temp = indices[i];
                    indices[i] = indices[j];
                    indices[j] = temp;
                }
            }
        }
        
        StringBuffer answer = new StringBuffer();
        answer.append(my_string);
        
        for(int i = 0;i<indices.length;i++){
            answer.deleteCharAt(indices[i]);
        }
        
        return answer.toString();
    }
}