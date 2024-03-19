import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<T;i++){
            String n = sc.nextLine();
            String change = ""+n.charAt(0) + n.charAt(n.length()-1);
            System.out.println(change);
        }   
    }
}