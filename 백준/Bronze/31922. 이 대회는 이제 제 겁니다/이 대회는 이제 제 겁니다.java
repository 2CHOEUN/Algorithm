import java.io.*;
import java.util.Arrays;
import java.util.HashSet;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out));
        String input = br.readLine();
        String []divisions = input.split(" ");
        int [] division = new int[divisions.length];
        for(int i = 0 ; i < divisions.length; i++){
            division[i] = Integer.parseInt(divisions[i]);
        }
        int max = Math.max(division[0] + division[2] , division[1]);

        bw.write("" + (max));
        bw.flush();
        bw.close();
        br.close();
    }
}
