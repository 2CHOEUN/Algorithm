class Solution {
    public int solution(int n) {
        int answer = 0;
        String n2 = Integer.toBinaryString (n);
        int ncount = 0;
        for(int i=0;i<n2.length();i++){
            if(n2.charAt(i)=='1'){
                ncount ++;
            }
        }
        
        
        for(int i=n+1;i<10000000;i++){
            String istr = Integer.toBinaryString (i);
            int icount = 0;
            for(int j=0;j<istr.length();j++){
                if(istr.charAt(j)=='1'){
                    icount ++;
                }
            }
            if(ncount == icount){
                answer = i;
                break;
                
            }
            
        }
        return answer;
    }
}