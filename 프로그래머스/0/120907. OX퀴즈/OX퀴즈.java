class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int result = 0;
        
        for(int i = 0; i < quiz.length; i++){
            String [] num = quiz[i].split(" ");
            result = Integer.parseInt(num[0]);
            for(int j=0;j<num.length;j++){
                if(num[j].equals("+")){
                    result += Integer.parseInt(num[j+1]);
                }else if(num[j].equals("-")){
                    result -= Integer.parseInt(num[j+1]);
                }
            }
            if(result == Integer.parseInt(num[num.length-1])){
                answer[i] = "O";
            }else{
                answer[i] = "X";
            }
          
        }
        return answer;
    }
}