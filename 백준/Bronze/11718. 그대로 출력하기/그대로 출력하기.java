import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            try{
            String msg = sc.nextLine();
            if(msg ==null || msg.isEmpty()){
                break;
            }
             System.out.println(msg);
            }catch(Exception e){
                break;
            }

        }
    }
}