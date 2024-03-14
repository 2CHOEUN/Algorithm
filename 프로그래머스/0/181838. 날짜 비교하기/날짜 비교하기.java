class Solution {
    public int solution(int[] date1, int[] date2) {
        String d1 = "";
        String d2 = "";
        for(int i = 0; i < date1.length; i++){
            d1 += date1[i];
            d2 += date2[i];
        }
        return Integer.parseInt(d1) < Integer.parseInt(d2) ? 1 : 0;
    }
}