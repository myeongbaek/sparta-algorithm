import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        // arr의 길이를 저장하여
        int n = arr.length;
        int division_count = 0;
        int[] output = new int[n];
        // 그 길이만큼 for loop를 만들어줍니다
        for (int i = 0; i < n; i++) {
            if ((arr[i] % divisor) == 0){
                output[division_count] = arr[i];        // [5,2,3,9], 3 => [3,9,0,0]
                division_count = division_count + 1;
            }};
        
        int[] answer = new int[division_count];    
        int slice_count = 0;
        
        for (int i = 0; i < n; i++){
            if (output[i] != 0){
                answer[slice_count] = output[i];
                slice_count = slice_count + 1;
            }
        };
        
        if (answer.length == 0){
            int[] answer_null = new int[1];
            answer_null[0] = -1;
            return answer_null;
        }
        
        Arrays.sort(answer);

        return answer;
    }
}