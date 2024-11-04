import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
         
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 상근이가 가지고 있는 숫자 카드 입력
        int N = Integer.parseInt(br.readLine());
        String[] inputCard = br.readLine().split(" ");
        Set<Integer> set = new HashSet<>();

        // 숫자 카드들을 집합(set)에 저장
        for (String s : inputCard) {
            set.add(Integer.parseInt(s));
        }

        // 찾고자 하는 숫자들 입력
        int M = Integer.parseInt(br.readLine());
        String[] inputSG = br.readLine().split(" ");

        // 입력된 숫자가 set에 있는지 여부를 확인 후 결과 출력
        for (int i = 0; i < M; i++) {
            if (set.contains(Integer.parseInt(inputSG[i]))) {
                bw.write("1 ");
            } else {
                bw.write("0 ");
            }
        }

        bw.flush();
        bw.close();
    }
}
