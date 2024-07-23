class Solution {
    public int solution(int[] num_list) {
        int num1 = 0;
        int num2 = 0;
        
        for(int i = 0; i < num_list.length; i++){
            num1 += num_list[i];
            i++;
        }
        
        for(int i = 1; i < num_list.length; i++){
             num2 += num_list[i];
              i++;
        }
        return num1 > num2 ? num1 : num2;
    }
}