class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int answer[] = {0,0};
        int gleng = board[0] / 2 +1;
        int sleng = board[1] / 2 +1;

        for(int i=0;i<keyinput.length;i++){
            if(keyinput[i].equals("left") && -gleng < answer[0]-1 ){
                answer[0] --;
            }else if(keyinput[i].equals("right") && answer[0]+1 < gleng){
                answer[0] ++;
            }else if(keyinput[i].equals("up") && answer[1]+1 < sleng ){
                answer[1] ++;
            }else if(keyinput[i].equals("down") &&  -sleng < answer[1]-1){
                answer[1] --;
            }
        }
        return answer;
    }
}