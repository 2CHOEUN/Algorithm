import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Map <Character,Integer> map = new HashMap<>();
        int max = 1;
        
        for(int i=0;i < str.length();i++){
            char ch = Character.toUpperCase(str.charAt(i));
            if(map.containsKey(ch)){
                int getInt = map.get(ch);
                getInt ++;
                map.put(ch,getInt);
                if(max < getInt){
                    max = getInt;
                }
            }else{
                map.put(ch,1);
            }
        }
        int check = 0;
        Character result = '?';
        for (Character c : map.keySet()) {
            if(map.get(c) == max){
                check ++;
                result = c;
            }
        }

        System.out.println(check > 1 ? "?" : result.toString());
    }
}