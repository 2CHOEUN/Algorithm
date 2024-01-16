import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int first = sc.nextInt();
        int min = first;
        int max = first;
        for(int i=0;i<N-1;i++){
            int num = sc.nextInt();
            if(min>num){
                min = num;
            }else if(max <num){
                max = num;
            }
        }
        System.out.println(min + " " + max);
    }
}