class Solution {
    public String solution(String polynomial) {
        
        int x = 0;
        int y = 0;
        StringBuffer answer = new StringBuffer();
        
        String [] num = polynomial.split(" ");
        for(int i=0;i<num.length;i++){
            if(num[i].endsWith("x") && num[i].indexOf("x")>0){
                x += Integer.parseInt(num[i].substring(0,num[i].indexOf("x")));
            }else if(num[i].endsWith("x")){
                x ++;
            }else if(!num[i].equals("+")){
                y += Integer.parseInt(num[i]);
            }
        }
       
        switch(x){
            case 0 : break;
            case 1 : answer.append("x");break;
            default : answer.append(x + "x");break;
        }
        
        if(y>0 && x !=0){
            answer.append(" + ");
        }
            
        if(y !=0){
            answer.append(y);
        }
        
        return  answer.toString();
    }
}