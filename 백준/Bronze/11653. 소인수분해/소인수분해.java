import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = 2;
       while(true){
           if(N % num == 0){
               System.out.println(num);
               N /= num;
           }else{
               num ++;
           }

           if(N <= 1){
               break;
           }
       }
    }

}
