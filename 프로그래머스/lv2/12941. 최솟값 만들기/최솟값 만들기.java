import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Integer [] b = new Integer[B.length];
        for(int i = 0; i<B.length;i++){
            b[i] = B[i];
        }
        Arrays.sort(A);
        Arrays.sort(b,Collections.reverseOrder());
        
        for(int i=0;i<A.length;i++){
            answer += (A[i] * b[i]);
        }    
        return answer;
    }
}