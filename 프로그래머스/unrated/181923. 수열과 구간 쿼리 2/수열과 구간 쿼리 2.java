class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for(int j=0;j<queries.length;j++){
            int s = queries[j][0];
            int e = queries[j][1];
            int k = queries[j][2];
            
            int min = -1; // 초기에는 -1로 설정
            
            for (int i = s; i <= e; i++) {
                if (arr[i] > k && (min == -1 || arr[i] < min)) {
                    min = arr[i];
                }
            }
            
            answer[j] = min;
        
        }

        return answer;
    }
}