import java.util.*;
class Solution {
    public long solution(String numbers) {
        Map <String ,String> map = new HashMap <String, String>();
        
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");
        
        for(Map.Entry<String,String> entry : map.entrySet()){
            
            String word = entry.getKey();
            String number = entry.getValue();
            
            numbers = numbers.replaceAll(word,number);
            
        }
        return Long.parseLong(numbers);
    }
}