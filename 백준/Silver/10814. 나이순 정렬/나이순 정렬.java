import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String[] members = new String[num];

        for (int i = 0; i < num; i++) {
            members[i] = br.readLine();
        }

        // 각 회원의 나이와 입력 순서를 저장할 배열
        int[][] ageAndIndex = new int[num][2];
        for (int i = 0; i < num; i++) {
            ageAndIndex[i][0] = Integer.parseInt(members[i].split(" ")[0]); // 나이
            ageAndIndex[i][1] = i; // 입력 순서
        }

        // 회원 정보를 나이와 입력 순서에 따라 정렬
        Arrays.sort(ageAndIndex, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) {
                    return Integer.compare(a[1], b[1]);
                } else {
                    return Integer.compare(a[0], b[0]);
                }
            }
        });

        // 정렬된 순서대로 출력
        for (int i = 0; i < num; i++) {
            bw.write(members[ageAndIndex[i][1]] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
