import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        int goal [] = new int[N];
        for(int t = 0;t < M;t++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            
            for(i -=1;i<=j-1;i++){
                goal[i] = k;
            }
            sc.nextLine();
        }
        
        for(int i=0;i<goal.length;i++){
            System.out.print(goal[i] + " ");
        }
        
    }
}