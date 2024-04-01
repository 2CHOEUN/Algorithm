import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String [] a = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        String str = sc.nextLine();
        int count = 0;
        for(int i=0;i<str.length();i++){
            for(int j = 0;j < a.length;j++){
                if(a[j].indexOf(str.charAt(i)) >= 0){
                    count = count + (j + 2);
                }
            }
            count ++;
        }
        System.out.println(count);
    }
}