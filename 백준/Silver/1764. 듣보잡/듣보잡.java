import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        Set<String> inputSet = new HashSet<>();
        List<String> resultList = new ArrayList<>();
        
        StringBuilder br = new StringBuilder();
        for(int i = 0; i < N; i++){
            String name = sc.nextLine();
            inputSet.add(name);
        }
        
        for(int i = 0; i < M; i++){
            String name = sc.nextLine();
            if(inputSet.contains(name)){
                resultList.add(name);
            }
        }
        Collections.sort(resultList);
        System.out.println(resultList.size());
        resultList.forEach(System.out::println);
    }
}