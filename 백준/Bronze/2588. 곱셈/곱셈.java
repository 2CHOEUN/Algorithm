import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        //개행문자처리
        sc.nextLine();
        String b = sc.nextLine();
        
        int num1 = a * (b.charAt(2) - '0');
        int num2 = a * (b.charAt(1) - '0');
        int num3 = a * (b.charAt(0) - '0');
        
        String num22 = num2 + "0" ;
        String num33 = num3 + "00";
        
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num1 + Integer.parseInt(num22) + Integer.parseInt(num33));
         
        
    }
}