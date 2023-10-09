import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int n = 0;
        for(int i=0;i<picture.length;i++){
            StringBuffer br = new StringBuffer();
            for(int j=0;j<picture[i].length();j++){
                for(int count = 0;count<k;count++){
                   br.append(picture[i].charAt(j));
                }
            }
            for(int count = 0;count<k;count++){
                answer[n] = br.toString();
                n++;
            }
        }
        return answer;
    }
}