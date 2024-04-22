import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] num = new int[3][2];
        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num[i].length; j++){
                num[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
        int x = 0;
        int y = 0;
        if(num[0][0] == num[1][0]){
            x = num[2][0];
        }else{
            x = num[1][0] == num[2][0] ? num[0][0] : num[1][0];
        }

        if(num[0][1] == num[1][1]){
            y = num[2][1];
        }else{
            y = num[1][1] == num[2][1] ? num[0][1] : num[1][1];
        }
        System.out.println(x + " " + y);
    }
}
