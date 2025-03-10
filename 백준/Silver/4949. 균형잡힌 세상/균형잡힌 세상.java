import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            String input = sc.nextLine();
            if(input.equals(".")){
                break;
            }
            
           if(isBalanced(input)){
               System.out.println("yes");
           }else{
               System.out.println("no");
           }
        }
    }
    
    private static boolean isBalanced(String str){
        Stack<Character> stack = new Stack<>();
        
       for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false;
                }
                stack.pop();
            } else if (ch == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    return false;
                }
                stack.pop();
            }
        }
            return stack.isEmpty(); // 스택이 비어있으면 균형 잡힘
    }
}