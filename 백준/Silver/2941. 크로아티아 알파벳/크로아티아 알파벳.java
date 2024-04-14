import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        String [] cro = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        for(int i=0; i < cro.length; i++){
            N = N.replaceAll(cro[i],"1");
        }
        System.out.print(N.length());
    }
}