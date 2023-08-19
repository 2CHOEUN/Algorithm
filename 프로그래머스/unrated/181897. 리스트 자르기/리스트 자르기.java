import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        
        int[] answer = {};

        switch(n){
            case 1 : 
                answer = Arrays.copyOfRange(num_list,0,slicer[1]+1);break;
            case 2 : 
                answer = Arrays.copyOfRange(num_list,slicer[0],num_list.length);break;
            case 3 : 
                answer = Arrays.copyOfRange(num_list,slicer[0],slicer[1]+1);break;
            case 4 : 
                answer = new int[(slicer[1]-slicer[0])/slicer[2] +1];
                int num = 0;
                for(int i = slicer[0]; i <= slicer[1]+1; i += slicer[2]){
                    if(num < answer.length){
                        answer[num++] = num_list[i];
                    }
                }
        }
        return answer;
    }
}