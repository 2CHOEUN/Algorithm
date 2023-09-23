class Solution {
    public String solution(String s) {
        String [] schar = s.split(" ");
        
        int max = Integer.parseInt(schar[0]);
        int min = Integer.parseInt(schar[0]);
        
        for(int i=0;i<schar.length;i++){
            if(min > Integer.parseInt(schar[i])){
                min = Integer.parseInt(schar[i]);
            }else if(max < Integer.parseInt(schar[i])){
                max = Integer.parseInt(schar[i]);
            }
        }
        String answer = min +" " + max;
        return answer;
    }
}