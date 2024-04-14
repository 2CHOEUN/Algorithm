import java.util.*;
class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int totalCount = 0;
        for(int i = 0; i < N; i++){
            String str = sc.nextLine();
            boolean b = true;
            Set<Character> set = new HashSet<>();
            for(int j = 0; j <str.length(); j++){
                char ch = str.charAt(j);
                if(set.contains(ch)){
                    if(j > 0){
                        char before = str.charAt(j-1);
                        if(before != ch){
                            b=false;
                            break;
                        }
                    }else{
                        b = false;
                        break;
                    }
                }else{
                    set.add(ch);
                }
            }
            if(b){
                totalCount ++;
            }
        }
        System.out.println(totalCount);
    }
}
