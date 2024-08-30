class Solution {
    public int solution(String s) {
        int answer = 0;
        String [] sn = s.split(" ");
        
        for(int i = 0; i < sn.length; i++){
            if(!sn[i].equals("Z")){
                if(i != sn.length-1 && sn[i+1].equals("Z")){
                    answer -= Integer.parseInt(sn[i]);
                }
               answer += Integer.parseInt(sn[i]);
            }
        }
        return answer;
    }
}