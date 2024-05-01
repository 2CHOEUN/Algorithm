import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int num = n % 5;

        if(n % 5 ==0){
            count += (n / 5);
        }else {
            while(n >= 3){
                n -= 3;
                count ++;

                if(n % 5 == 0){
                    count += (n / 5);
                    n = 0;
                    break;
                }
            }
            if (n != 0) {
                count = -1; // 남은 무게가 3 또는 5의 배수가 아닌 경우 처리
            }

        }

        System.out.println(count);
    }

}
