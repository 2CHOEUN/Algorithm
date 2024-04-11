import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            int num = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            int sum = 0;
            
            if(num == -1){
                break;
            }
            for(int i=1;i<num;i++){
                if(num % i ==0){
                    arr.add(i);
                    sum += i;
                }
            }
            if(num == sum){
                System.out.print(num + " = ");
                for(int i = 0; i < arr.size(); i++){
                    System.out.print(arr.get(i));
                    if(i < arr.size()-1){
                        System.out.print( " + ");
                    }
                }
            }else{
                System.out.print(num + " is NOT perfect.");
            }


            sc.nextLine();
            System.out.println();

        }
    }
}