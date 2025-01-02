import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int count = nums.length / 2;
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0 ; i < nums.length; i++){
            int key = nums[i];
            set.add(key);
        }
        if(set.size() > count){
            answer = count;
        }else{
            answer = set.size();
        }
        
        return answer;
    }
}