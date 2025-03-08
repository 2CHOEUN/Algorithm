import java.util.*;

class Main {
    private int solution(int k, int[] arr) {
        int result = 0;

        for (int i = arr.length - 1; i >= 0; i--) { // 큰 동전부터 사용
            if (arr[i] <= k) {
                result += k / arr[i]; // 해당 동전으로 사용할 수 있는 최대 개수 추가
                k %= arr[i]; // 남은 금액 갱신
            }
        }

        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // 동전 가치 입력
        }

        Main main = new Main();
        System.out.println(main.solution(k, arr));
    }
}
