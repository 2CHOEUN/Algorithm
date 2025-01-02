import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int num[] = {a, b, c, d};
        Arrays.sort(num);
        if (num[0] == num[1] && num[1] == num[2] && num[2] == num[3]) {
            return 1111 * num[0];
        } else if (num[0] == num[1] && num[1] == num[2]) {
            return (10 * num[0] + num[3]) * (10 * num[0] + num[3]);
        } else if (num[1] == num[2] && num[2] == num[3]) {
            return (10 * num[3] + num[0]) * (10 * num[3] + num[0]);
        } else if (num[0] == num[1]) {
            if (num[2] == num[3]) {
                return (num[0] + num[2]) * Math.abs(num[0] - num[2]);
            } else {
                return num[2] * num[3];
            }
        } else if (num[1] == num[2]) {
            if (num[0] == num[3]) {
                return (num[1] + num[3]) * Math.abs(num[1] - num[3]);
            } else {
                return num[0] * num[3];
            }
        } else if (num[2] == num[3]) {
            if (num[0] == num[1]) {
                return (num[2] + num[1]) * Math.abs(num[2] - num[1]);
            } else {
                return num[0] * num[1];
            }
        } else {
            return num[0];
        }
    }
}
