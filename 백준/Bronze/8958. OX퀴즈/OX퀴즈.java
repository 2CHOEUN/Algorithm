import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int count = 1;
        int sum = 0;
        for(int i = 0 ; i < n; i++){
            String ox = sc.nextLine();
            for(int j = 0 ; j < ox.length();j++){
                if(ox.charAt(j) == 'O'){
                    sum += count;
                    count ++;
                }else{
                    count = 1;
                }
            }
            System.out.println(sum);
            count = 1;
            sum = 0;
        }

    }
}
