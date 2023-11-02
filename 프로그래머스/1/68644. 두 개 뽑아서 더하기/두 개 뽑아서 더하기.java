import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> arr = new ArrayList<Integer>();
     
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1; j<numbers.length;j++){
                int sum = numbers[i] + numbers[j];
                if(!arr.contains(sum)){
                    arr.add(sum);
                }
            }
        }
        
        int[] answer = new int[arr.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = arr.get(i);    
        }
        Arrays.sort(answer);
        
        return answer;
    }
}