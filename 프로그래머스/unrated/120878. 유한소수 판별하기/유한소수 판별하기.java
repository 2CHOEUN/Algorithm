class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        int gc = 1;
        if(a < b){
            for(int i = 2; i<=b;i++){
                if(a % i ==0 && b % i ==0){
                    gc = i;
                }
            }
        }else{
            for(int i = 2; i<=a;i++){
                if(a % i ==0 && b % i ==0){
                    gc = i;
                }
            }
        }
        
        a = a / gc;
        b = b / gc;
       
        while (b % 2 == 0) {
            b /= 2;
        }
        while (b % 5 == 0) {
            b /= 5;
        }

        if (b == 1) {
            return 1;
        } else {
            return 2;
        }
    }
}