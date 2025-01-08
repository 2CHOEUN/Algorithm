import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stackInt = new Stack<>();

        for (int i = 0; i < N; i++) {
            String[] command = br.readLine().split(" ");
            switch (command[0]) {
                case "1": // 1 X: 정수 X를 스택에 넣는다.
                    stackInt.push(Integer.parseInt(command[1]));
                    break;
                case "2": // 2: 스택에서 맨 위의 정수를 빼고 출력.
                    if (stackInt.empty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(stackInt.pop()).append("\n");
                    }
                    break;
                case "3": // 3: 스택에 들어있는 정수의 개수 출력.
                    sb.append(stackInt.size()).append("\n");
                    break;
                case "4": // 4: 스택이 비어있으면 1, 아니면 0 출력.
                    sb.append(stackInt.empty() ? "1\n" : "0\n");
                    break;
                case "5": // 5: 스택에서 맨 위의 정수를 출력.
                    if (stackInt.empty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(stackInt.peek()).append("\n");
                    }
                    break;
            }
        }
        System.out.print(sb);
    }
}
