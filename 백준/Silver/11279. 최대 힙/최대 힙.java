import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // 최대 힙

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                if (maxHeap.isEmpty()) {
                    sb.append("0\n");
                } else {
                    sb.append(maxHeap.poll()).append("\n"); // 최대값 출력 후 제거
                }
            } else {
                maxHeap.add(x); // 힙에 추가
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
