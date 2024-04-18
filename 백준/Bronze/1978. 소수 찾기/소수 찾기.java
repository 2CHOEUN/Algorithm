import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int count = 0;
        for(int i = 0; i < N; i++){
            int inputNum = sc.nextInt();
            boolean s = false;

            for(int j = 2; j < inputNum; j++){
                if(inputNum % j == 0){
                    s = true;
                    break;
                }
            }
            if(inputNum == 1){
                continue;
            }
            if(!s) {
                count ++;
            }
        }
        System.out.println(count);

    }
}
