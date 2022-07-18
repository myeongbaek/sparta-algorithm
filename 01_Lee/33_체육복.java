import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int lostNum : lost) {
            for (int i=0; i<reserve.length; i++) {
                if (lostNum == reserve[i] | lostNum == reserve[i] - 1 | lostNum == reserve[i] + 1) {
                    answer++;
                    reserve[i] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}
