import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int [] num = new int[30];
        for(int i=0;i<28;i++){
            int n = sc.nextInt();
            num[n-1] = 1;
            sc.nextLine();
        }
        
        for(int i=0;i<num.length;i++){
            if(num[i] == 0){
                System.out.println(i+1);
            }
        }
    }
}