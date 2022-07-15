/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/42576?language=java
 * 문제 분석
 * 매 마라톤마다 한 명 빼고 완주한다.
 * 4명이 참가하면 3명이 완주하고 완주하지 못한 1명을 찾는 문제
 *
 * 계획
 * Sort/Loop
 * 1. 두 배열을 정렬한다.
 * 2. 두 배열이 다를 때까지 찾는다.
 * 3. 두 배열을 다 찾았는데도 못 찾았다면, 마지막 주자가 완주하지 못한 선수다.
 *
 * Hash
 * - 1. HashMap 을 만든다.(참가자)
 * - 2. HashMap 을 뺀다. (완주자)
 * - 3. value 가 0이 아닌 마지막 주자를 찾는다.
 **/


package programmers;

import java.util.Arrays;
import java.util.HashMap;

public class 완주하지못한선수 {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        Solution p = new Solution();
        System.out.println(p.solution01(participant, completion));
        System.out.println(p.solution02(participant, completion));
    }
}

class Solution {
    public String solution01(String[] participant, String[] completion) {

        String result = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }

        result = participant[completion.length];

        return result;
    }

    public String solution02(String[] participant, String[] completion) {

        String result = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }

        for (String player : completion) {
            map.put(player, map.get(player) - 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                result = key;
                break;
            }
        }
        return result;
    }
}

/**
 * 회고
 * 문제에 명시된 참가자 중에 동명이인이 있을 수 있다는 걸 체크하지 않아서 시간을 오래 썼다. 문제를 잘 읽자.
 * 해시맵에 익숙해지자
 * equals -> 내용 비교 / == -> 주소값 비교
 */
