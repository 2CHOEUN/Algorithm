import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.nextLine();
        int sum =0;
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            sum += (str.charAt(i)-'0');
        }
        System.out.println(sum);
    }
}