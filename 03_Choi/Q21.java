import java.util.*;

public class Q21 {

    private static int sumIndex = 0;
    private static ArrayList<Integer> sumArr = new ArrayList<Integer>();


    public int solution() {
        System.out.println("qestion 21 소수 만들기");

        int[] nums = new int[]{1,2,3};
        boolean[] visited = new boolean[nums.length];
        int sum = 0;
        int count = 0;
        int answer = -1;

        // 조합 갯수 가져오기

        // 조합을 가져오기
        getCountFromCombination(nums, visited, 0, nums.length, 3, sum);

        // 조합에서 소수 여부 판단하기

        return answer;
    }

    public boolean isPrime(int n){
        for(int i = 2; i < n; i++){
            if(n % i != 0)
                return false;
        }
        return true;
    }

    private void getCountFromCombination(int[] arr, boolean[] visited, int start, int n, int r, int sum){
        if(r == 0){
            //sumarr 에 값을 저장 - sum index 활용
            return;
        }

        for(int i = start; i < n; i++){
            visited[i] = true;
            sum += arr[i];
            getCountFromCombination(arr, visited, i+1, n, r - 1, sum);
            visited[i] = false;
            sum = 0;
        }
    }
}
