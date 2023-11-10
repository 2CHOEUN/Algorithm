class Solution {
    public int solution(String my_string) {
        int answer = 0;
   
        
        for(int i=0;i<my_string.length();i++){
            if(my_string.codePointAt (i)>='0'&&my_string.codePointAt (i)<='9'){
            answer += my_string.codePointAt(i)-'0';
            }
        }

        return answer;
    }
}