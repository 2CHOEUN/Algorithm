import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String [] inputRead = br.readLine().split(" ");

        int A = Integer.parseInt(inputRead[0]);
        int B = Integer.parseInt(inputRead[1]);
        int V = Integer.parseInt(inputRead[2]);
        
        int day = (V - B - 1) / (A - B) + 1;

        bw.write("" +day);

        br.close();
        bw.flush();
        bw.close();
    }
}
