import java.util.*;

class Main {
    public static void main(String[] args) {

        HashSet<Integer> kaprekarNumbers = new HashSet<>();
        for(int i = 1; i < 10000; i++){
            int kapNum = kaprekarNum(i);
            kaprekarNumbers.add(kapNum);
        }

        for(int i = 1; i < 10000; i++){
            if(!kaprekarNumbers.contains(i)){
                System.out.println(i);
            }
        }

    }
    private static int kaprekarNum(int num){
        int sum = num;
        while(num > 0){
            sum += (num % 10);
            num /= 10;
        }
        return sum;
    }
}
