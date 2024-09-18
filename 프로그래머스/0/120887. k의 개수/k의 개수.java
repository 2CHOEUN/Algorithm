class Solution {
    public int solution(int i, int j, int k) {
        
        int answer = 0;
      
        for(int z=i;z<=j;z++){
              String gg = Integer.toString(z);
            String kk = Integer.toString(k);
            for(int x=0;x<gg.length();x++){
                if(gg.charAt(x)==kk.charAt(0)){
                    answer ++;
                }
            }
        }
        return answer;
    }
}