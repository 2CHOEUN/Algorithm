class Solution {
    public boolean solution(int x) {
        String n [] = (x + "").split("");
        
        int num = 0;
        
        for(int i = 0; i < n.length; i++){
            num += Integer.parseInt(n[i]);
        }
        return x % num == 0 ? true : false;
    }
}