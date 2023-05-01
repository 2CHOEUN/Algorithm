class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int [2];
        
        int i = 0;
        int j = 0;
        
        for(int z=0;z<num_list.length;z++){
            if(num_list[z]%2==0){
                i++;
            }else{
                j++;
            }
            answer[0]=i;
            answer[1]=j;
        }
        
        return answer;
    }
}