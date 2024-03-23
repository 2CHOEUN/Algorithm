import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.nextLine();
        StringBuffer br= new StringBuffer("" + num1);
        StringBuffer br2= new StringBuffer("" + num2);

        br.reverse();
        br2.reverse();
        
        num1 = Integer.parseInt(br.toString());
        num2 = Integer.parseInt(br2.toString());
        System.out.println(num1 > num2 ? num1 : num2);

    }
}