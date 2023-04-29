class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int [] num = new int [included.length];
        
        num[0] = a;   

        for(int i=1; i < num.length; i++){
            num[i] = num[i-1] + d;
        }

        for (int i=0; i<included.length;i++){
            if(included[i]){
                answer += num[i];
            }
        }
        
        return answer;
    }
}