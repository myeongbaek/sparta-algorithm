import java.util.*;

public class Q15 {
    public void solution(int []arr) {
        System.out.println("==============");
        System.out.println("qestion 15 같은 숫자는 싫어");
        int temp = arr[0];

        // 동적으로 값을 저장합니다. <> 안에는 저장할 데이터 타입이 들어갑니다.
        ArrayList<Integer> answer = new ArrayList<Integer>();

        for(int i = 0; i < arr.length; i++){

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
