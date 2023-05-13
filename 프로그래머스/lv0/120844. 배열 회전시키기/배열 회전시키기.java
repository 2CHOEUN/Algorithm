class Solution {
    public int[] solution(int[] numbers, String direction) {
        
        int[] answer = new int [numbers.length];
        int temp =0;
        
        switch(direction){
        case "left" : 

                for(int i=0;i<numbers.length-1;i++){
                     answer[i] = numbers[i+1];
                    }
                answer[numbers.length-1] = numbers[0];break;
                
        case "right" : 

                for(int i=1;i<numbers.length;i++){
                     answer[i] = numbers[i-1];
                    }
                answer[0] = numbers[numbers.length-1];
        }
        return answer;
    }
}