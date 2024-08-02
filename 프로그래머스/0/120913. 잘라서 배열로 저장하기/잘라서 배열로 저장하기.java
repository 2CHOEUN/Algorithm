import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        StringBuffer br = new StringBuffer();
        ArrayList <String> arr = new ArrayList<String>();
        
        for(int i = 0; i < my_str.length(); i++){
            if((i+1) % n == 0){
                br.append(my_str.charAt(i));
                arr.add(br.toString());
                br.delete(0,br.length());
                continue;
            }
            br.append(my_str.charAt(i));

        }
        if(!br.toString().equals("")){
            arr.add(br.toString());
        }
        String[] answer = new String[arr.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}