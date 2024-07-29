class Solution {
      public String solution(String s) {
        char [] chars = s.toCharArray();
        int cnt = 0;
        StringBuilder br = new StringBuilder();
          for (char aChar : chars) {
            cnt ++;
            cnt = Character.isSpaceChar(aChar) ? 0: cnt ++;
            if(cnt == 0){
                br.append(" ");
                continue;
            }else{
                br.append(cnt % 2 == 0 ? Character.toLowerCase(aChar) : Character.toUpperCase(aChar));
            }
        }
        return br.toString();
      }
}