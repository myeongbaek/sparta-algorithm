import java.util.*;

public class Q27 {
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
