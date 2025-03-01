import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> arr = new ArrayList<>();
        int count = 1;
        int day = (int) Math.ceil((100.0 - progresses[0]) / speeds[0]);

        for (int i = 1; i < progresses.length; i++) {
            int useDay = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            if (useDay > day) {
                arr.add(count);
                count = 1; // 새로운 배포 시작
                day = useDay;
            } else {
                count++;
            }
        }

        arr.add(count); // 마지막 배포 추가

        return arr.stream().mapToInt(i -> i).toArray();
    }
}
