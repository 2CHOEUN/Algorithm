class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int i = 0;
        
        do{
            k--;
            i += 2;
            
            if(i > numbers.length){
                i = i - numbers.length;
            }
        }while(k > 1);
        
        return numbers[i];
    }
}