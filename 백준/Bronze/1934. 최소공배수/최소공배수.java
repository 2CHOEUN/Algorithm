import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            sc.nextLine();
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            System.out.println((A * B) / gcd(A,B));
            
        }
    }
    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }

}