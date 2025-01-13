import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[])throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n; i++){
            long x = Long.parseLong(br.readLine());
            if(x == 0){
                if(minHeap.isEmpty()){
                    sb.append("0\n");
                }else{
                    sb.append(minHeap.poll()).append("\n");
                }
            }else{
                minHeap.add(x);
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}