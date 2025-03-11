import java.io.*;
import java.util.*;
class Main{
    private int[] solution(int [] nCard, int [] mCard){
        Map<Integer, Integer> cardCount = new HashMap<>();
        int [] answer = new int[mCard.length];
        
        for(int num : nCard){
            cardCount.put(num, cardCount.getOrDefault(num,0) + 1);
        }
        for(int i = 0; i < mCard.length; i++){
            answer[i] = cardCount.getOrDefault(mCard[i], 0);
        }  
        return answer;
    }
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] nCard = new int[N];
        String[] nInput = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            nCard[i] = Integer.parseInt(nInput[i]);
        }

        int M = Integer.parseInt(br.readLine());
        int[] mCard = new int[M];
        String[] mInput = br.readLine().split(" ");
        for (int i = 0; i < M; i++) {
            mCard[i] = Integer.parseInt(mInput[i]);
        }

        Main main = new Main();
        for (int count : main.solution(nCard, mCard)) {
            bw.write(count + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}