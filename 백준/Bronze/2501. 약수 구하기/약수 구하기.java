import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int N = sc.nextInt();
        int K = sc.nextInt()-1;
        
        for(int i=1; i <= N;i++){
            if(N % i == 0){
                arr.add(i);
            }
        }
        try{
            int result = arr.get(K);
            System.out.println(result);
        }catch(Exception e){
             System.out.println(0);
        }
        
    }
}