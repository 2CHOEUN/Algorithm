class Solution {
    public int[] solution(String my_string) {
        int num = 0;
        
        for(char i = 'a'; i <='z'; i++){
            num ++;
        }
        for(char i = 'A'; i <='Z'; i++){
            num ++;
        }
        
        int answer[] = new int [num];
        
        num = 0;
        
         for(int i = 'A'; i <= 'Z'; i++){
            for(int j = 0; j < my_string.length(); j++){
                if(i == my_string.charAt(j)){
                    answer[num] ++;
                }
            }
              num++;
        }
        
        for(int i = 'a'; i <= 'z'; i++){
            for(int j = 0; j < my_string.length(); j++){
                if(i == my_string.charAt(j)){
                    answer[num] ++;
                }
            }
            num++;
           }
         
        
        return answer;
    }
}