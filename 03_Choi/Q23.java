public class Q23 {

    public static void main(String args[]) {
        Q23 q23 = new Q23();
        System.out.println(q23.solution("AB", 1));
        System.out.println(q23.solution("z", 1));
        System.out.println(q23.solution("a B z", 4));
        q23 = null;
    }

    public String solution(String s, int n) {
        System.out.println("qestion 23 시저 암호");

        String answer = "";

        int str;
        for (int i = 0; i < s.length(); i++) {
            str =  (int) s.charAt(i);
            // NOT in a~z, A~Z
            if (!((str >= 65 && str <= 90) || (str >= 97 && str <= 122))) {
                answer += (char) str;
                continue;
            }

            str += n;
            if (str > 122 || ((str < 97) && (str > 90))) {
                str -= 26;
            }
            answer += (char) str;
        }
        return answer;
    }
}
