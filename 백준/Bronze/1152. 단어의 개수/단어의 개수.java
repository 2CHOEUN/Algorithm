import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int count = arr.length;
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("")){
                count --;
            }
        }
        System.out.print(count);
    }
}