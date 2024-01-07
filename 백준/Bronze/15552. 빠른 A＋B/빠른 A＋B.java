import java.io.*;
class Main{
    public static void main(String args[]) throws IOException{
        BufferedWriter buf = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            String [] input = (br.readLine()).split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            buf.write((a+b) + "\n");
        }
        
        buf.flush();
        buf.close();
        br.close();
    }
}