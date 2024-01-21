import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        int n[] = new int[N];
        
        for(int i=0;i<n.length;i++){
            n[i] = i+1;
        }
        for(int k=0;k<M;k++){
            int i = sc.nextInt() -1;
            int j = sc.nextInt()-1;
            
            int temp = n[i];
            int tempj = n[j];
            n[i] = tempj;
            n[j] = temp;
            
            sc.nextLine();
        }
        for(int i =0;i<n.length;i++){
            System.out.print(n[i] + " ");
        }
    }
}