
import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        // arr의 길이가 1일 경우 -1을 리턴
        if (arr.length == 1){
            int[] answer_empty = {-1};
            return answer_empty;
        } 
        
        // min을 배열의 첫 값으로 지정한 후
        // for문을 돌릴때 min보다 더 작은 수가 있으면 min에 재지정
        int index = 0;
        int min = arr[index];

        for (int i = 1; i < arr.length; i++){
            if (arr[i] <= min){
            min = arr[i];
            index = i;
            }
        }
        System.out.println(index);
        // arr보다 길이가 1 적은 새로운 배열은 만든 후
        // 저장된 최소값의 index는 건너 뛰고 if문으로 배열에 나머지 항목을 재지정
        int[] result = new int[arr.length-1];
        
        int count = 0;
        for (int i=0; i < arr.length; i++){
            if (i != index){
                result[count] = arr[i];
                count+=1;    
            }
        }
        
        return result;
    }
}