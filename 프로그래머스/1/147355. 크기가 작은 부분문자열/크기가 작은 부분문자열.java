class Solution {
    public int solution(String t, String p) {
        int len = p.length();
        long pParse = Long.parseLong(p);
        int answer = 0;

      for(int i = 0 ; i <= t.length()-len; i++){
          long num = Long.parseLong(t.substring(i, i+len));
           if(num  <= pParse){
               answer ++;
           }
        
      }
        return answer;
    }
}