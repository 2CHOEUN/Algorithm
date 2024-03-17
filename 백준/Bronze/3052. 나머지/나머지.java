import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Map<Integer,Boolean> map = new HashMap<>();
        int count = 0;
        for(int i=0;i<10;i++){
            int N = sc.nextInt();
            sc.nextLine();
            int num = N % 42;
            if(!map.containsKey(num)){
                count++;
            }
            map.put(num,true);
        }
        System.out.print(count);
    }
}