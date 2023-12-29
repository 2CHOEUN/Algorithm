import java.util.*;
class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        char score = 'F';
       
        if(num >=90){
            score = 'A';
        }else if(num >= 80){
            score = 'B';
        }else if(num >=70){
            score = 'C';
        }else if(num >= 60){
            score = 'D';
        }
        System.out.println(score);
        
    }
}