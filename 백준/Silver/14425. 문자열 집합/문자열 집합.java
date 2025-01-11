import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // N개의 문자열로 이루어진 집합 S 입력 받기
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine(); // 개행 문자 소비

        Set<String> setS = new HashSet<>();
        for (int i = 0; i < N; i++) {
            setS.add(sc.nextLine());
        }

        // M개의 문자열 중 집합 S에 포함된 개수 확인
        int result = 0;
        for (int i = 0; i < M; i++) {
            String input = sc.nextLine();
            if (setS.contains(input)) {
                result++;
            }
        }

        // 결과 출력
        System.out.println(result);
    }
}
