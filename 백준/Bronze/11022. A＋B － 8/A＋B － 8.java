import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        
        for(int x=1;x<=T;x++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            sc.nextLine();
            System.out.println("Case #"+x+": "+A+" + "+B+" = "+(A+B));
        }
    }
}