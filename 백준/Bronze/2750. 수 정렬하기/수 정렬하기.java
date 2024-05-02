import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int [] arr = new int[n];
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
            sc.nextLine();
        }

        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}
