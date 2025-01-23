import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
       //옷을 종류별로 분류
        Map<String, Integer> map = new HashMap<>();
        
        // 옷을 종류별로 분류하며 카운트
        for (String[] cloth : clothes) {
            String type = cloth[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }
        
        //모든 종류의 경우의 수 계산
        int answer = 1;
        for(int count : map.values()){
            answer *= (count + 1); //특정 종류의 옷을 입지 않는 경우를 포함
        }
        //최소 한개의 옷은 입어야 하므로 아무것도 입지 않는 경우를 제외
        return answer -1;
    }
}