import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        ArrayList<Integer> divisor = new ArrayList<Integer>();
        
        if (n==0){
            return 0;
        }
        for (int i=1;i<3001;i++){
            if (n%i == 0){
                divisor.add(n/i);
                divisor.add(i);
            }
        }
        int answer = divisor.stream().mapToInt(Integer::intValue).sum() / 2;
        return answer;
    }
}