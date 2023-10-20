class Solution {
    public int solution(String t, String p) {
        int plength = p.length();
        int answer = 0;

        for(int i=0;i<=t.length()-plength;i++){
            StringBuffer num = new StringBuffer();
            for(int j=i;j<i+plength;j++){
                num.append(t.charAt(j));
            }
            if(!num.equals("") && Long.parseLong(num.toString()) <= Long.parseLong(p)){
                answer ++;
            }
        }
        return answer;
    }
}