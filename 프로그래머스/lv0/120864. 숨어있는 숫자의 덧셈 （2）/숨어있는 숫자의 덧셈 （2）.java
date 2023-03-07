
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for(int i=0;i<my_string.length();i++){
            if((my_string.charAt(i)>='a'&&my_string.charAt(i)<='z')
               ||(my_string.charAt(i)>='A'&&my_string.charAt(i)<='Z')){
                my_string = my_string.replaceAll(""+my_string.charAt(i),"/");
            }
        }
        String [] str = my_string.split("/");
        for(int i=0; i<str.length;i++){
            if(!str[i].equals("")){
                answer += Integer.parseInt(str[i]);
            }
        }
        return answer;
    }
}