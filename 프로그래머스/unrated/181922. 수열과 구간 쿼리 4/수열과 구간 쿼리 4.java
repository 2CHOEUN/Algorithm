class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<queries.length;j++){
                int s = queries[j][0];
                int e = queries[j][1];
                int k = queries[j][2];
                if(s<=i && i<=e){
                    if(i % k == 0){
                        arr[i] += 1;
                    }
                }
            }
        }
        return arr;
    }
}