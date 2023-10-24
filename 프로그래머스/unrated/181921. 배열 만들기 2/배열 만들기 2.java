import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int l, int r) {
        ArrayList<Integer> arr = new ArrayList<>();
        StringBuilder br = new StringBuilder();
        for(int i =l; i<=r;i++){
           br.append("" +i);
            int result = 0;
            for(int j=0;j<br.length();j++){
                if(br.toString().charAt(j)!='5' && br.toString().charAt(j) !='0'){
                    result = 1;
                }
            }
            
            if(result == 0){
                arr.add(i);
            }
              br.delete(0,br.length());

        }
        
        if(arr.size()==0){
            arr.add(-1);
        }
        return arr;
    }
}