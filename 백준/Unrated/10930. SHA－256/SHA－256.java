import java.util.*;
import java.security.MessageDigest;

class Main{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        String answer = "";
        md.update(input.getBytes());
        for(byte b : md.digest()){
            answer += String.format("%02x",b);
        }
        System.out.println(answer);
    }
}
