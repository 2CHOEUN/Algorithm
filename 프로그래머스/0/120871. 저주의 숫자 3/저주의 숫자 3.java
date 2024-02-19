class Solution {
    public int solution(int n) {
        int num = 1;
        int x3 = 1;

        while (num <= n) {
            if (x3 % 3 == 0 || (x3 + "").contains("3")) {
                x3++;
            }else{
                num++;
                x3++;
            }
        }

        return x3-1;
    }
}
