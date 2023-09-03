import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        int answer = 0;
        
        for(int i=0;i<strArr.length;i++){
            if(!map.containsKey(strArr[i].length())){
                map.put(strArr[i].length(),1);
            }else{
                int num = map.get(strArr[i].length());
                num ++;
                map.put(strArr[i].length(),num);
            }
        }
        
        int num = 0;
        
        for(int i=1;i<=30;i++){
            if(map.containsKey(i) && map.get(i) > num ){
                num = map.get(i);
                answer = num;
            }
        }
        return answer;
    }
}