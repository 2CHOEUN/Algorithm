import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
         sc.nextLine();
        
        for (int i = 0; i < T; i++) {
            int R = sc.nextInt();
            String str = sc.next();

            for (char ch : str.toCharArray()) {
                for (int j = 0; j < R; j++) {
                    System.out.print(ch);
                }
            }
            System.out.println();
        }
    }
}