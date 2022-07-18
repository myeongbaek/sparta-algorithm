/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/68644
 * 문제 분석
 * 정수 배열에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수의 배열을 오름차순으로 담아 리턴한다.
 *
 * 계획
 * 이중 for 문
 * 1. 이중 반복문 안에서 하나 씩, 하나 씩 전부 더한다.
 * 2. 새로 만든 배열에 위에서 더한 값이 있는지 contains() 함수로 체크하고 없으면 배열에 추가한다.
 * 3. 오름차순으로 정렬하고 리턴한다.
 *
 * HashSet
 * 1. 종복을 허용하지 않는 HashSet 저장할 공간 만들기
 * 2. 각각의 합을 리털한 배열 공간에 추가하고 정렬한다.
 * */

package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class 두개뽑아서더하기 {
    public static void main(String[] args) {
        Solution04 p = new Solution04();

        int[] numbers = {2, 1, 3, 4, 1};
        p.solution(numbers);
        p.solution_(numbers);
    }
}


class Solution04 {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sum = numbers[i] + numbers[j];
                if (!list.contains(sum)) {
                    list.add(sum);
                }
            }
        }

        int[] answer = new int[list.size()];
        Collections.sort(list);

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public int[] solution_(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
/**
 * 회고
 * 스트림이 익숙하지 않은데 '데이터가 흐르는 통로' 로 일단 이해하자.
 * 그리고 스트림을 잘 활용하면 함수형 프로그래밍도 가능하고 코드도 더 간결하게 만들어줘서 장점이 많아보인다.
 * */
