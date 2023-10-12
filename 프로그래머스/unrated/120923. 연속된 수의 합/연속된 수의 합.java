class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int [num];
        int i = -100;
        while(true){
            int result = 0;
            for(int j=i;j<i+num;j++){
                result += j;
            }
            
            if(result == total){
                for(int j=0;j<answer.length;j++){
                    answer[j] = i++;
                }
                break;
            }
            i++;
        }
        return answer;
    }
}