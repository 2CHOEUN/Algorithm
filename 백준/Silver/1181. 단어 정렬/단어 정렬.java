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
        int N = Integer.parseInt(br.readLine());
        Set <String> set = new HashSet<>();
        for(int i = 0; i < N; i++){
            String inputStr = br.readLine();
            set.add(inputStr);
        }
        String [] setArray = new String[set.size()];
        set.toArray(setArray);

        Arrays.sort(setArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
  if(o1.length() != o2.length()){
                    return Integer.compare(o1.length(),o2.length());
                }else{
                    return o1.compareTo(o2);
                }

            }
        });

        for(int i = 0 ; i < setArray.length; i++){
            bw.write(setArray[i] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
