import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int num [] = new int[3];
        int count = 0;
        for(int i=0;i<rank.length;i++){
            map.put(rank[i],i);
        }
        for(int i=1;i<=rank.length;i++){
            if(attendance[map.get(i)] && count < 3){
                num[count++] = map.get(i);
            }
        }
        
        return 10000 * num[0] + 100 *num[1] + num[2];
    }
}