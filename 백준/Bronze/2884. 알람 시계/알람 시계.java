import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String []hhmm = input.split(" ");
        int hh = Integer.parseInt(hhmm[0]);
        int mm = Integer.parseInt(hhmm[1]);
        mm -=45 ;
        
        if(mm <0){
            mm += 60;
            hh --;
            
            if(hh <0){
                hh = 23;
            }
        }
        System.out.println(hh +" " +mm);
    }
}