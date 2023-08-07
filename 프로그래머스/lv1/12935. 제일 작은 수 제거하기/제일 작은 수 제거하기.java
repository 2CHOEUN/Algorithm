class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length != 1 ? arr.length -1:1];
        
        if(answer.length == 1){
            answer[0] = -1;
        }
        int num = arr[0];

        for(int i = 0; i<arr.length-1;i++){
                if(num >= arr[i]){
                    num = arr[i];
                }
        }
        int n = 0;

        for(int i=0; i<arr.length;i++){
            if(arr[i] != num){
                answer[n++] = arr[i];
            }
        }
        return answer;
    }
}