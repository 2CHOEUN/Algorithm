import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String [] abc = input.split(" ");
        Long num = 0L;
        for(int i=0;i<abc.length;i++){
            num += Long.parseLong(abc[i]);
        }
        System.out.println(num);
    }
}