import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [] arr = new int [N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int closestSum = 0;
        //초기 최대값
        for(int i = 0; i < 3; i ++){
            closestSum += arr[i];
        }

        for(int i = 0 ; i < N - 2; i++){
            int left = i + 1;
            int right = N - 1;

            while(left < right){
                int sum = arr[i] + arr[left] + arr[right];
                if(sum <= M){
                    if(M - sum < M - closestSum){
                        closestSum = sum;
                    }
                    left ++;
                }else{
                    right --;
                }
            }
        }
        System.out.println(closestSum);

    }
}
