import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a ==0 && b ==0){
                break;
            }
            sc.nextLine();
            System.out.println(a+b);


        }
    }
}