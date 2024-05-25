import java.io.*;
import java.util.HashSet;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>(N);

        String []split = br.readLine().split(" ");
        for(int i = 0 ; i < split.length; i++){
            set.add(Integer.parseInt(split[i]));
        }
        
        int M = Integer.parseInt(br.readLine());

        int [] arrCompared = new int[M];
        String [] split2 = br.readLine().split(" ");
        for(int i = 0 ; i < split2.length; i++){
            arrCompared[i] = Integer.parseInt(split2[i]);
        }


        for(int i = 0 ; i < arrCompared.length;i++){
            if(set.contains(arrCompared[i])){
                bw.write("1\n");
            }else{
                bw.write("0\n");
            }

        }
        bw.flush();
        bw.close();
        br.close();
    }
}
