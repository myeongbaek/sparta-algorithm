import java.util.Arrays;

public class Q2 {

    public void solution(int[] arr, int divisor) {
        System.out.println("qestion 2 나누어 떨어지는 숫자 배열");

        // get size of arr
        int count = 0;
        for(int i = 0; i < arr.length; i++)
            if(arr[i] % divisor == 0)
                count++;

        if(count == 0)
            System.out.println("-1");

        // get value to arr
        int[] answer = new int[count];
        for(int i = 0; i < answer.length; i++)
            if(arr[i] % divisor == 0)
                answer[i] = arr[i];

        // sorting
        Arrays.sort(answer);


        // print
        for(int i = 0; i < answer.length; i++){
            System.out.print(answer[i] + " ");
        }
        System.out.println();
    }
}
