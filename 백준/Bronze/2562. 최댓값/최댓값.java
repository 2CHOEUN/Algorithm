import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int arr[] = new int[9];
        
        for(int i=0;i<arr.length;i++){
           int n = sc.nextInt();
           arr[i] = n;
           if(n > max){
               max = n;
           }
            sc.nextLine();
         }
        for(int i=0;i<arr.length;i++){
            if(arr[i] == max){
                System.out.println(max);
                System.out.println(i+1);
                return;
            }
        }
    }
}