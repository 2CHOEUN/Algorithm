class Solution {
    public int[] solution(int[] arr, int n) {
        
        for(int i = 0; i < arr.length; i++){
            if(arr.length % 2 == 0){
                i++;
                arr[i] = arr[i] + n;
            }else{
                arr[i] = arr[i] + n;
                i++;
            }
        }
        return arr;
    }
}