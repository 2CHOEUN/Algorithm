class Solution {
    public int[] solution(int[] numlist, int n) {
        for (int i = 0; i < numlist.length - 1; i++) {
            for (int j = i+1; j < numlist.length; j++) {
                if(Math.abs(n - numlist[i]) == Math.abs(n - numlist[j]) && numlist[i] < numlist[j]){
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }else if (Math.abs(n - numlist[i]) > Math.abs(n - numlist[j])) {
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
            }
            
        }
        return numlist;
    }
}
