import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<N;i++){
            int x = sc.nextInt();
            if(x < X){
                System.out.print(x + " ");
            }
            
        }
    }
}