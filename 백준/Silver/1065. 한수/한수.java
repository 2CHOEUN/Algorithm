import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        for(int i = 1; i <= N; i++){
            if(i < 100){
                count++;
            }else {
                int hundreds = i / 100;
                int tens = (i / 10) % 10;
                int ones = i % 10;

                if((hundreds - tens) == (tens - ones)){
                    count ++;
                }
            }
        }

        System.out.println(count);
    }
}
