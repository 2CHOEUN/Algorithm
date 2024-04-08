import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int result = 1;
        for(int i = 0; i < str.length();i++){
            char ch = str.charAt(str.length()-1 - i);
            if(str.charAt(i) != ch){
                result = 0;
                break;
            }
        }
        System.out.println(result);

    }
}