import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for(int i=N;i>=1;i=i-4){
            System.out.print("long ");
        }
        System.out.print("int");
    }
}