import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//입력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int []arr  = new int[N];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

      Arrays.sort(arr);

        for(int i = 0 ; i < arr.length; i++ ){
            bw.write(arr[i] + " \n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
