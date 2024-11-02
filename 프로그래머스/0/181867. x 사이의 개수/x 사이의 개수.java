class Solution {
    public int[] solution(String myString) {
        String [] str = myString.split("x");
        
        int[] answer = new int[myString.charAt(myString.length()-1) == 'x' ? str.length +1 : str.length];
        
        int num = 0;
        
        for(int i = 0; i < str.length; i++){
            answer[num ++] = str[i].length();
        }
        
        return answer;
    }
}