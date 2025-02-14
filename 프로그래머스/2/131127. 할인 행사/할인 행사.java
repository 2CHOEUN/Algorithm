import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String ,Integer> wantMap = new HashMap<String, Integer>();        
        
        //원하는 제품과 수량 저장 Map
        for(int i = 0; i < number.length; i++){
            wantMap.put(want[i], number[i]);
        }
        int n = discount.length;
        
        for(int i = 0; i <= n - 10; i++){
            Map <String,Integer> disCountMap = new HashMap<String, Integer>();
            
            // i부터 10일 동안의 할인 품목 저장
            for(int j = i; j < i + 10; j++){
                disCountMap.put(discount[j], disCountMap.getOrDefault(discount[j], 0) + 1);
            }
            //원하는 제품과 수량 일치하는지 확인
            if(isMatching(wantMap, disCountMap)){
                answer ++;
            }
        }
        
        return answer;
    }
    
    /**원하는 상품과 할인 상품의 개수가 일치하는지 확인*/
    private boolean isMatching(Map<String, Integer> wantMap, Map<String, Integer> discountMap){
        for(String key : wantMap.keySet()){
            if(discountMap.getOrDefault(key, 0) < wantMap.get(key)){
                return false;
            }
        }
        return true;
    }
}