class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int v = 1; v <= number; v++){
            int count = 0;
            
            //약수 계산
            for(int i = 1; i * i <= v; i++){
                if(v % i == 0){
                    count ++;
                    if( i != v / i){
                        count ++; //대칭 약수?
                    }
                }
            }
            if(count > limit){
                answer += power;
            }else{
                answer += count;
            }
        }
 
        return answer;
    }
}