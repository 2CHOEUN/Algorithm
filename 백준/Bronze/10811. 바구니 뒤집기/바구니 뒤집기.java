import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [] arr = new int[N];
        
        for(int i=0;i<arr.length;i++){
            arr[i] = i+1;
        }        
        sc.nextLine();
        for(int m = 0; m < M; m++){
            int i = sc.nextInt()-1;
            int j = sc.nextInt()-1;
            
            while(i<j){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j--;
            }
            sc.nextLine();
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}