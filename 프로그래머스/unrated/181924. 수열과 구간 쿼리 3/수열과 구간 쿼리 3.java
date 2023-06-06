class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
            int num = 0;
            int num2 = 0;
        
            for(int i = 0; i < queries.length; i++){
                num = queries[i][0];
                num2 = queries[i][1];
                int temp = 0;
                temp = arr[num];
                arr[num] = arr[num2];
                arr[num2] = temp;
            }
            
            
        return arr;
    }
}