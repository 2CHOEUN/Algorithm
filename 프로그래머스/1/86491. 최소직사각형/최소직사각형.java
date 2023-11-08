class Solution {
    public int solution(int[][] sizes) {
        int min = 0;
        int max = 0;
        
        for(int i=0;i<sizes.length;i++){
            int mmin = 0;
            int mmax = 0;
            
            if(sizes[i][0] > sizes[i][1]){
                 mmax = sizes[i][0];
                 mmin = sizes[i][1];
            }else{
                mmax = sizes[i][1];
                mmin = sizes[i][0];
            }
            
            if(max < mmax){
                max = mmax;
            }
            if(min < mmin){
                min = mmin;
            }
        }
        int answer = min * max;
        return answer;
    }
}