import java.util.*;
class Main{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int max[] = new int[2];
        int maxNum = 0;
        int [][]arr = new int[9][9];
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
                int num = arr[i][j];
                if(maxNum <= num){
                    max[0]= i+1;
                    max[1]= j+1;
                    maxNum = arr[i][j];
                }
            }
            sc.nextLine();
        }
        System.out.println(maxNum);
        System.out.println(max[0] + " " + max[1]);
    }
}