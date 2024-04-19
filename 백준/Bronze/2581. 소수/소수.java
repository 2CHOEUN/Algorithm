import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        sc.nextLine();
        int N = sc.nextInt();
        int min = 0;
        int sum = 0;

        for(int i = M; i<=N; i++){
            boolean s = false;
            if(i == 1){
                continue;
            }
            for(int j = 2; j < i;j++){
                if(i % j ==0){
                    s = true;
                    break;
                }
            }
            if(!s){
                sum += i;
                if(min == 0){
                    min = i;
                }
                if(min > i){
                    min = i;
                }
            }
        }
        if(sum == 0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);

        }
    }
}
