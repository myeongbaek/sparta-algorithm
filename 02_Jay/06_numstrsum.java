import java.util.*;

// integer -> string
// string index
// result += string

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String string = Integer.toString(n);            // 35 -> "35"
        for (int i=0; i<string.length(); i++){
            char a = string.charAt(i);                  // "3" at 1st iter 
            int number = Character.getNumericValue(a);  // 3
            answer += number;                           // add to result
        }
        return answer;
    }
}