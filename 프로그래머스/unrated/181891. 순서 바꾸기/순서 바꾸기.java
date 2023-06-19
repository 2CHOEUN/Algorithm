class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int[] answer = new int [num_list.length];
        
        int i = n;
        int answerIndex = 0;
          
        do{
            if(n == num_list.length){
                return num_list;
            }
            answer[answerIndex ++] = num_list[i++];
            
            if( i == num_list.length){
                i = 0;
            }
            
        }while(i != n);
        
        return answer;
    }
}