class Solution {
    public String solution(String s) {
       String answer = "";
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(Character.isWhitespace(s.charAt(i))){
                answer += " ";
                count = 0;
            }else if(count % 2 ==0){
                answer += Character.toUpperCase(s.charAt(i));
                count++;
            }else{
                answer += Character.toLowerCase(s.charAt(i));
                count++;
            }
        }
        return answer;
    }
}