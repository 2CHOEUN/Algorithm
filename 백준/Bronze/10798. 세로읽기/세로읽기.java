import java.util.*;
class Main{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
        String[][] str = new String[5][15]; // 최대 글자수 15로 설정
        for (int i = 0; i < 5; i++) {
            String input = sc.next(); // next() 메서드로 한 단어씩 읽음
            str[i] = input.split("");
        }
        for (int i = 0; i < 15; i++) { // 최대 글자수 15로 설정
            for (int j = 0; j < 5; j++) {
                if (str[j].length > i && str[j][i] != null) // 해당 열에 글자가 있는 경우에만 출력
                    System.out.print(str[j][i]);
            }
        }
    }
}