import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String n1 ="*";
        for(int i=1;i<=n;i++){
            System.out.println(n1);
            n1 +="*";
        }

    }
}