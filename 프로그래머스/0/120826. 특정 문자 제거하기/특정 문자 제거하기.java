class Solution {
    public String solution(String my_string, String letter) {
                String answer = "";

       for(int i=0;i < my_string.length();i++){
           for(int j=0; j < letter.length();j++){
               if(my_string.charAt(i) != letter.charAt(j)){
                 answer += my_string.charAt(i);
               }
           }
       }
        
        return answer;
    }
}