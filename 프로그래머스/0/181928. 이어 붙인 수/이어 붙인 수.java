class Solution {
    public int solution(int[] num_list) {
        String num1 = "";
        String num2 = "";
        
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 ==0){
                num1 += num_list[i]+"";
            }else{
                num2 += num_list[i]+"";
            }
        }
        int answer = Integer.parseInt(num1) + Integer.parseInt(num2);
        return answer;
    }
}