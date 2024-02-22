import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        
        for(char c ='a';c <= 'z';c++){
            if(0 <= S.indexOf(c)){
                System.out.print(S.indexOf(c));
            }else{
                System.out.print("-1");
            }
            System.out.print(" ");
        }
    }
}