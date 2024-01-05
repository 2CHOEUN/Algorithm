import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        sc.nextLine();
        int count = sc.nextInt();
        sc.nextLine();
        long num = 0;
        for(int i=1;i<=count;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.nextLine();
            num = num +(a * b);
        }
        
        System.out.println(num == total ? "Yes":"No");
    }
}