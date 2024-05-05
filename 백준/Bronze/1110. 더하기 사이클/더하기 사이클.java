import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = N;
        int count = 0;
        int num1 = result / 10 ;
        int num2 = result % 10 ;
        result = (num1) + (num2);
        while(true){
            count ++;
            result = (num2 % 10 *10) + (result %10);
            
            if(result == N){
                break;
            }
            num1 = result / 10;
            num2 = result % 10;
            result = num1 + num2;

        }
        System.out.println(count);


    }
}
