import java.util.*;

class Main {
    private static boolean[] visited;
    private static List<Integer>[] graph;

    private static int dfs(int node) {
        visited[node] = true;
        int count = 0;

        for (int next : graph[node]) {
            if (!visited[next]) {
                count += 1 + dfs(next);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 컴퓨터 수
        int M = sc.nextInt(); // 네트워크 연결 수

        graph = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }

        System.out.println(dfs(1)); // 1번 컴퓨터에서 시작
    }
}
