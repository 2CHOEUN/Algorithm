import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < N; i++){
            int input = Integer.parseInt(br.readLine());

            if(input == 0 && i != 0){
                arr.remove(arr.size()-1);
            }else{
                arr.add(input);
            }
        }
        int sum = 0;
        for(int i = 0 ; i < arr.size(); i++){
            sum += arr.get(i);
        }
        bw.write("" + sum);

        br.close();
        bw.flush();
        bw.close();
    }
}
