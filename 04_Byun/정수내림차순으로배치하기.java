/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12933
 * 문제 분석
 * 정수의 각 자릿수를 큰 것부터 작은 순으로 정렬해서 정렬된 새로운 정수를 리턴한다.
 *
 * 계획
 * 1. 정수를 배열에 넣어서 Arrays.sort() 함수 이용 -> 오름차순 정렬
 * 2. 내림차순으로 정렬된 정수가 필요하기 때문에 reverse() 함수 이용
 * 3. reverse() 함수를 제공하는 StringBuilder 클래스를 사용(->스레드를 고려할 필요가 없고 더 빠르다)
 **/
package programmers;

import java.util.Arrays;

public class 정수내림차순으로배치하기 {
    public static void main(String[] args) {
        Solution02 p = new Solution02();
        System.out.println(p.solution(118372));
    }
}
class Solution02 {
    public long solution(long n) {
        char[] chars = String.valueOf(n).toCharArray();
        Arrays.sort(chars);
        String sb = new StringBuilder(new String(chars)).reverse().toString();
        return Long.parseLong(sb);
    }
}
/**
 * 회고
 * String => immutable
 * StringBuilder => mutable
 * 불변,가변 객체 /  Garbage Collection / 메모리 누수 등 깊게 공부해야할 게 많다고 느꼈다.
 */
