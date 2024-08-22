class Solution {
      public boolean solution(String s) {
        boolean answer = true;

        if(!(s.length() == 4 || s.length() == 6)){
            return false;
        }
        char [] chars = s.toCharArray();
        for(char a : chars){
            if(Character.isAlphabetic( a )){
               return false;
            }
        }

        return answer;
    }
}