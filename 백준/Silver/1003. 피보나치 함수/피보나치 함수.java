import java.util.Scanner;

class Main {
    private static int countZero = 0;  // 0이 출력된 횟수
    private static int countOne = 0;   // 1이 출력된 횟수

    // 메모이제이션 배열
    private static int[] memoZero = new int[51];
    private static int[] memoOne = new int[51];

    // 피보나치 수 계산 (메모이제이션 사용)
    private static int fibonacci(int n) {
        if (n == 0) {
            countZero++; // 0 출력 시 카운트 증가
            return 0;
        } else if (n == 1) {
            countOne++;  // 1 출력 시 카운트 증가
            return 1;
        }
        
        // 이미 계산한 값이 있으면 그 값을 리턴
        if (memoZero[n] != -1 && memoOne[n] != -1) {
            countZero += memoZero[n];
            countOne += memoOne[n];
            return memoZero[n] + memoOne[n];
        }

        // 피보나치 값 계산
        int result = fibonacci(n - 1) + fibonacci(n - 2);
        
        // 계산된 값을 memo 배열에 저장
        memoZero[n] = countZero;
        memoOne[n] = countOne;
        
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // 테스트 케이스 수

        // memo 배열 초기화
        for (int i = 0; i <= 50; i++) {
            memoZero[i] = -1;
            memoOne[i] = -1;
        }

        // 각 테스트 케이스 처리
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();  // N번째 피보나치 수를 구하기 위한 입력값
            countZero = 0;
            countOne = 0;
            fibonacci(n);  // N번째 피보나치 수 계산

            // 0과 1의 출력 횟수 출력
            System.out.println(countZero + " " + countOne);
        }
    }
}
