import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N + 1];
        
        dp[1] = 0;  // 1은 이미 1이므로 연산이 필요하지 않음

        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] + 1;  // 기본적으로 1을 빼는 연산을 적용
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);  // 2로 나누는 연산을 적용
            }
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);  // 3으로 나누는 연산을 적용
            }
        }

        bw.write(dp[N] + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
