import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []arr = new int[N];
        
        sc.nextLine();
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        sc.nextLine();
        int V = sc.nextInt();
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == V){
                count ++;
            }
        }
        System.out.println(count);
    }
}