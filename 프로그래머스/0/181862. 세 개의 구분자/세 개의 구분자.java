import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        // "a", "b", "c"를 ","로 치환
        myStr = myStr.replace("a", ",").replace("b", ",").replace("c", ",");
        
        // ","를 기준으로 문자열 분리
        String[] temp = myStr.split(",");
        
        // 빈 문자열을 제외한 결과를 리스트에 저장
        List<String> resultList = new ArrayList<>();
        for (String str : temp) {
            if (!str.equals("")) {
                resultList.add(str);
            }
        }
        
        // 결과 리스트가 비어 있다면 ["EMPTY"] 반환
        if (resultList.isEmpty()) {
            return new String[] {"EMPTY"};
        }
        
        // 결과 리스트를 배열로 변환하여 반환
        return resultList.toArray(new String[0]);
    }
}
