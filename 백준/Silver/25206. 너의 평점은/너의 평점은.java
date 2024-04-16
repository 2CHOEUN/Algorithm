import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Double> map = new HashMap<>();
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);

        double totalGrade = 0;
        double sum = 0.0;
        
        // 입력 데이터의 형식을 확인하고 처리합니다.
        for (int i = 0; i < 20; i++) {
            String str = sc.nextLine();
            String[] obj = str.split(" ");
            
            // P/F 과목의 경우 P인 과목은 무시합니다.
            if (obj[2].equals("P")) {
                continue;
            }
            
            // 학점과 평점을 얻습니다.
            double credits = Double.parseDouble(obj[1]);
            double grade = map.get(obj[2]);
            
            // 학점의 총합을 계산합니다.
            totalGrade += credits;
            
            // (학점 × 과목평점)의 합을 계산합니다.
            sum += credits * grade;
        }
        
        // 전공 평점을 계산합니다.
        double result = sum / totalGrade;
        
        // 결과를 출력합니다.
        System.out.printf("%.6f\n", result);
    }
}
