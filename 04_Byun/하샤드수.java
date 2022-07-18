/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12947
 * 문제 분석
 * 하샤드수의 정의: 주어진 양의 정수 x의 자릿수의 합으로 x가 나누어져야 한다.
 * 하샤드수가 맞다면 true / 아니라면 false 반환
 *
 * 계획
 * 1. x의 자릿수 합을 구한다. -> 어떻게? 배열에 넣어서 합을 구함
 * 2. x를 자릿수의 합으로 나눠 떨어지는지 확인한다. -> 나머지가 0인지 확인
 * */

package programmers;

public class 하샤드수 {
    public static void main(String[] args) {
        Solution03 p = new Solution03();
        System.out.println(p.solution(13));
    }
}

class Solution03 {
    public boolean solution(int x) {

        String xToString = String.valueOf(x);

        int sum = 0;
        for (int i = 0; i < xToString.length(); i++) {
            sum += Integer.parseInt(String.valueOf(xToString.charAt(i)));
        }

        return x % sum == 0 ? true : false;
    }
}
/**
* 회고
* 언어는 자주 안 쓰면 어색해지는 거 같다. 근데 어제보단 자바가 익숙해졌다고 느낀다.
* 어제보단 빠르게 풀었다.
* 생각만 하는게 아니라 문제분석, 계획을 세워서 적고 정리하니까 알고리즘 푸는데 많이 도움된다.
* */
