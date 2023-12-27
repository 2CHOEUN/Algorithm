import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        
        String result = a>b? ">" : "<";
        
        if(a==b){
            result = "==";
        }
        System.out.println(result);
        
        
    }
}