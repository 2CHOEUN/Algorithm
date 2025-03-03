import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String inputA = sc.nextLine();
        String inputB = sc.nextLine();

        // "null" 문자열을 실제 null 객체로 변환
        inputA = inputA.equals("null") ? null : inputA;
        inputB = inputB.equals("null") ? null : inputB;

        // A.equals(B) 수행
        try {
            System.out.println(inputA.equals(inputB));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }

        // A.equalsIgnoreCase(B) 수행
        try {
            System.out.println(inputA.equalsIgnoreCase(inputB));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
    }
}
