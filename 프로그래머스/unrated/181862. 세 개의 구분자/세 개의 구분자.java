import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        StringBuffer br = new StringBuffer();
        
        ArrayList<String> arr = new ArrayList<String>();
        
        for(int i = 0; i < myStr.length();i++){
            if(myStr.charAt(i) == 'a' || myStr.charAt(i) == 'b' || myStr.charAt(i) == 'c'){
                if(!br.toString().equals("")){
                    arr.add(br.toString());
                    br.delete(0,br.length());
                }
            }else{
                br.append(myStr.charAt(i));
            }
        }

        arr.add(br.toString());


        String[] answer = new String[arr.size()];
        
        for(int i=0;i<answer.length;i++){
            answer[i] = arr.get(i);
            if(answer[0].equals("")){
                answer[0] = "EMPTY";
            }
        }
        
        return answer;
    }
}