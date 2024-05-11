import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int count = 1 ;
        int roomNumber = 1;  //현재 방의 번호
        int increment = 6;

        while(roomNumber < N){
            roomNumber += increment;
            increment += 6;
            count ++;
        }
       
        System.out.println(count);
    }
}
