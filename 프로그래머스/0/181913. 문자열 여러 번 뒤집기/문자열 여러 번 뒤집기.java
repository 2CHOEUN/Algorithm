class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuffer answer = new StringBuffer(my_string);
        StringBuffer a = new StringBuffer();

        for(int i=0; i<queries.length;i++){
            a.append(answer.substring(queries[i][0],queries[i][1]+1));
            a.reverse();
            answer.replace(queries[i][0],queries[i][1]+1,a.toString());
            a.delete(0,a.length());
        }
        
        return answer.toString();
    }
}