import java.util.*;

public class Q27 {
    public static void main(String args[]) {

        Q27 q27 = new Q27();
        System.out.println(q27.solution(new int[]{1,3,2,5,4}, 9));
        System.out.println(q27.solution(new int[]{2,2,3,3}, 10));
        q27 = null;
    }
    public int solution(int[] d, int budget) {
        System.out.println("qestion 21 예산");

        int answer = 0;
        Arrays.sort(d);

        for(int v : d){
            if(budget >= v) {
                budget -= v;
                answer++;
            }

        }
        return answer;
    }
}
