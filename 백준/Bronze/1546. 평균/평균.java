import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] arr = new double[N];

        int max = Integer.MIN_VALUE; // 최댓값을 초기화
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            arr[i] = (double) num;
            if (num > max) {
                max = num;
            }
        }
        double sum = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = arr[i] / max * 100.0; // 최댓값을 사용하여 변환
            sum += arr[i];
        }
        System.out.println(sum / N); // 평균 출력
        
    }
}
