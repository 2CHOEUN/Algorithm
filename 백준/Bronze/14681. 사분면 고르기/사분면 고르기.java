import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
       sc. nextLine();
        int y = sc.nextInt();
        int result = 4;
        if(x > 0 && y >0){
            result = 1;
        }else if(x < 0 && y > 0){
            result = 2;
        }else if(x < 0 && y <0){
            result = 3;
        }
        System.out.println(result);
    }
}