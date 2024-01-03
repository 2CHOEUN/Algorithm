import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int a = 0;
        int b = 0;
        for(int i = 1;i<=n*2;i++){
            if(i % 2 ==0){
                b = sc.nextInt();
                System.out.println(a + b);
                sc.nextLine();
            }else{
                a = sc.nextInt();
            }
        }
        sc.close();
    }    
}