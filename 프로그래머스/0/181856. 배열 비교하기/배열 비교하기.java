class Solution {
    public int solution(int[] arr1, int[] arr2) {
        
        if(arr1.length != arr2.length){   
            return arr1.length > arr2.length ? 1 : -1 ;
        }else{
            int num1 = 0;
            int num2 = 0;
            for(int i = 0; i < arr1.length ; i++){
                num1 += arr1[i];
            }
            
            for(int i = 0; i < arr2.length; i++){
                num2 += arr2[i];
            }
            if(num1 == num2){
                return 0;
            }else{
                return num1 > num2 ? 1 : -1;
            }
        }
    }
}