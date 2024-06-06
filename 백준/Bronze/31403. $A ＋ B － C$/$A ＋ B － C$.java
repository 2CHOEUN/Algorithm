import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      int A = Integer.parseInt(br.readLine());
      int B = Integer.parseInt(br.readLine());
      int C = Integer.parseInt(br.readLine());

      bw.write((A + B - C) + "\n");
      bw.write(Integer.parseInt(""+A + B) - C + "");
      bw.flush();
      bw.close();
      br.close();

    }
}
