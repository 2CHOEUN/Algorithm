import java.util.*;
class Solution {
    public String solution(String phone_number) {
        StringBuffer br = new StringBuffer();
        
        for(int i = 0; i < phone_number.length(); i++){
            if(i < phone_number.length() - 4){
              br.append("*");
            }else{
              br.append(phone_number.charAt(i));

            }
        }
        return br.toString();
    }
}