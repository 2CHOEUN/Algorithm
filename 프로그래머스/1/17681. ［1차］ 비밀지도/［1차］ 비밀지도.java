class Solution {
    
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String len = "%" + (arr1.length)+"s";
        String [] answer = new String[arr1.length];
        String [] arrStr1 =  new String[arr1.length];
        
        for(int i=0;i<arr1.length;i++){
            String str = String.format(len, Integer.toBinaryString(arr1[i])).replace(" ","0");
            String str2 =  String.format(len, Integer.toBinaryString(arr2[i])).replace(" ","0");
            StringBuilder br = new StringBuilder();
           for(int j=0;j<str.length();j++){
               if(str.charAt(j)=='1' ||str2.charAt(j)=='1'){
                   br.append("#");
               }else{
                   br.append(" ");
               }
           } 
            answer[i] = br.toString();
        }
        return answer;
    }
}