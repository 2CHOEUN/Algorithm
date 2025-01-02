class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int zz = 0;
        for(int i = 0 ; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
                zz ++;
            }
        }
        answer[0] = zz;
        answer[1] = num_list.length - zz;
        return answer;
    }
}