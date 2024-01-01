import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String inputnow = sc.nextLine();
        int inputtime = sc.nextInt();
        
        String now[] = inputnow.split(" ");
        int hh = Integer.parseInt(now[0]);
        int mm = Integer.parseInt(now[1]);
        
        mm += inputtime;
        
        if(mm >=60){
            hh = hh + (mm / 60);
            mm = mm % 60;
            
            if(hh > 23){
                hh = hh - 24;
            }
        }
        System.out.println(hh + " " + mm);
    }
}