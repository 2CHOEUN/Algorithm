class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        for(int i = 0; i < num_list.length; i++){
           answer = (num_list.length >= 11) ? answer + num_list[i] : answer * num_list[i];
        }
        return num_list.length >= 11 ? answer - 1 : answer;
    }
}