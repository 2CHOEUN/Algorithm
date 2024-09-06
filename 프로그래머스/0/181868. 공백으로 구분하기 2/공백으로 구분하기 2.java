import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        my_string = my_string.replaceAll(" ",",");
        
        ArrayList <String> strList = new ArrayList <String> ();
        
        String str = "";
        for(int i = 0; i < my_string.length();i++){
            if(my_string.charAt(i) == ','){
                if(!str.equals("")){
                    strList.add(str);
                    str = "";
                }
            }else{
                str += my_string.charAt(i);
                if(i == my_string.length() -1){
                    strList.add(str);
                }
            }
        }
        
        String [] answer = new String[strList.size()];
        for(int i = 0; i < strList.size(); i++){
            answer[i] = strList.get(i);
        }
        return answer;
    }
}