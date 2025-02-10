import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        //실행 대기 큐 : 우선순위, 원래 위치 형태로 저장
        Queue<int[]> queue = new LinkedList<>();
        
        //우선순위 큐  : 우선순위가 높은 값을 찾기 위해 사용
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        // 초기 실행 대기 큐 및 우선순위 큐 채우기
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{priorities[i], i});  // (우선순위, 원래 위치) 형태로 저장
            priorityQueue.offer(priorities[i]);  // 우선순위 큐에 우선순위 값만 저장 (내림차순 정렬)
        }
    
        int answer = 0;
        
         while (!queue.isEmpty()) {
            int[] current = queue.poll(); // 대기 큐에서 프로세스 하나 꺼내기
            
            // 현재 꺼낸 프로세스의 우선순위가 대기 큐에서 가장 높은 값인지 확인
            if (current[0] < priorityQueue.peek()) {
                // 현재 프로세스보다 높은 우선순위가 있다면 다시 큐에 삽입 (맨 뒤로 보냄)
                queue.offer(current);
            } else {
                // 현재 프로세스를 실행 (제거)하고 실행 순서 증가
                answer++;
                priorityQueue.poll(); // 실행했으므로 우선순위 큐에서도 제거

                // 실행한 프로세스가 우리가 찾던 `location`이면 실행 순서 반환
                if (current[1] == location) {
                    return answer;
                }
            }
        }

        return answer; // 실행 순서를 반환 (이 코드까지 도달하지 않음
    }
}