/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/72410
 * 문제 분석
 * 아이디 규칙에 맞지 않는 아이디를 입력했을 때, 입력된 아이디와 유사하면서 규칙에 맞는 아이디를 추천해주는 프로그램을 개발
 *
 * 계획
 * 문제에서 주어진 단계 별 처리를 순서대로 한다.
 * */

package programmers;

public class 신규아이디추천 {
    public static void main(String[] args) {
        Solution06 p = new Solution06();
        System.out.println(p.solution("=.="));
    }
}

class Solution06 {
    public String solution(String new_id) {
        String answer;

        String step1 = new_id.toLowerCase();

        char[] step1Arr = step1.toCharArray();
        StringBuilder step2 = new StringBuilder();
        for (char c : step1Arr) {
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.') {
                step2.append(c);
            }
        }

        String step3 = step2.toString().replace("..", ".");
        while (step3.contains("..")) {
            step3 = step3.replace("..", ".");
        }

        String step4 = step3;
        if (step4.length() > 0) {
            if (step4.charAt(0) == '.') {
                step4 = step4.substring(1, step4.length());
            }
        }
        if (step4.length() > 0) {
            if (step4.charAt(step4.length() - 1) == '.') {
                step4 = step4.substring(0, step4.length() - 1);
            }
        }

        String step5 = step4;
        if (step5.equals("")) {
            step5 = "a";
        }

        String step6 = step5;
        if (step6.length() >= 16) {
            step6 = step6.substring(0, 15);

            if (step6.charAt(step6.length() - 1) == '.') {
                step6 = step6.substring(0, step6.length() - 1);
            }
        }

        StringBuilder step7 = new StringBuilder(step6);
        if (step7.length() <= 2) {
            char last = step7.charAt(step7.length() - 1);

            while (step7.length() < 3) {
                step7.append(last);
            }
        }

        answer = String.valueOf(step7);
        return answer;
    }
}
/**
 * 회고
 * String 관련 내장 함수를 많이 써볼 수 있는 문제였다.
 * substring(int beginIndex, int endIndex) 에서 첫 번째 파라미터는 inclusive 이고, 두 번째 파라미터는 exclusive 이다.
 * - Throws: IndexOutOfBoundsException – if the beginIndex is negative, or endIndex is larger than the length of this String object, or beginIndex is larger than endIndex.
 * */
