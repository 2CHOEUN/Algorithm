import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [][]arr = new int[N][M];
        sc.nextLine();
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                arr[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
        int [][]arr2 = new int[N][M];
         for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                arr2[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
        
         for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                System.out.print(arr[i][j] + arr2[i][j]);
                if(j<M-1){
                   System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}