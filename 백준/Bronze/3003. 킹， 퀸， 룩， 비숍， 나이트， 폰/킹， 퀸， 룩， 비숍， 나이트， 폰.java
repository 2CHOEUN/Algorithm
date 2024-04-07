import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int [] ch = {1,1,2,2,2,8};
        int [] input = new int[ch.length];
        for(int i = 0; i < input.length; i++){
            input[i] = sc.nextInt();
        }
        
        for(int i = 0; i < ch.length ; i++){
            System.out.print(ch[i] - input[i] + " ");
        }
    }
}