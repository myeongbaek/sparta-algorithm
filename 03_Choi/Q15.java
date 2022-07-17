import java.util.*;

public class Q15 {
    public void solution(int []arr) {
        System.out.println("qestion 10 같은 숫자는 싫어");
        int temp = arr[0];

        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
//            System.out.println(temp);
            if(i < arr.length - 1) {
                temp = arr[i + 1];
                if(arr[i] != temp)
                    answer.add(arr[i]);
            }
            else {
                answer.add(arr[i]);
            }

        }

        for(int i = 0; i < answer.size(); i++) {
            System.out.println(answer.get(i));
        }

    }
}
