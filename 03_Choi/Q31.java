import java.util.ArrayList;

public class Q31 {
    public static void main(String args[]) {
        Q31 q31 = new Q31();
        System.out.println(q31.solution(10));
        System.out.println(q31.solution(5));
        q31 = null;
    }
    public int solution(int n) {
        System.out.println("qestion 31 소수 찾기");

        ArrayList<Integer> primeSet = new ArrayList<>();
        int answer = 0;


        for (int i = 2; i <= n; i++) {
            if (isPrime(i, primeSet))
                primeSet.add(i);
        }

        answer = primeSet.size();

        return answer;
    }


    boolean isPrime(int a, ArrayList<Integer> primeSet) {

        for (int p : primeSet) {
            if (a % p == 0) return false;
        }

        for (int i = 2; i < a; i++) {
            if (a % i == 0)
                return false;
        }

        return true;
    }
}
