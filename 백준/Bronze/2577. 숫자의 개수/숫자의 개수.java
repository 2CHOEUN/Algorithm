import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = 1;
        for(int i = 0; i < 3; i++){
            num *= sc.nextInt();
        }
        String strNum = String.valueOf(num);
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < strNum.length();i++){
            int n = strNum.charAt(i) -'0' ;
            if(map.containsKey(n)){
                int value = map.get(n);
                value ++;
                map.put(n,value);
            }else{
                map.put(n,1);
            }
        }

        for(int i=0; i < 10; i++){
            if(map.containsKey(i)){
                System.out.println(map.get(i));
            }else{
                System.out.println(0);
            }
        }
    }
}
