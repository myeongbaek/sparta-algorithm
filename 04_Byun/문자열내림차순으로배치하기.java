/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12917
 * 문제 분석
 * 주어진 문자열을 큰 것부터 작은 순으로 정렬해서 리턴하기 (내림차순)
 * 소문자 > 대문자
 * "Zbcdefg" -> "gfedcbZ"
 *
 * 계획
 * 1. 일단 문자열을 배열에 넣어 Arrays.sort() 메서드 사용해 오름차순 정렬
 * 2. reverse() 메서드 사용해서 역순 정렬
 * */

package programmers;

import java.util.Arrays;

public class 문자열내림차순으로배치하기 {
    public static void main(String[] args) {
        Solution05 p = new Solution05();
        System.out.println(p.solution("Zbcdefg"));
    }
}

class Solution05 {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new StringBuilder(String.valueOf(chars)).reverse().toString();
    }
}
/**
 * 회고
 * 문제에 주어진 조건을 참고해서 계획을 만들고 그 계획을 코드로 그대로 옮기면 된다.
 * StringBuilder 에도 reverse()메서드가 있다는 걸 알았다.
 * */
