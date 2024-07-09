class Solution {
    public boolean solution(String s) {
        try{
            if(s.length() !=4 && s.length() !=6){
                return false;
            }
            int i = Integer.parseInt(s);
        }catch(Exception e){
            return false;
        }
            return true;

    }
}