public class Q23 {
    public String solution(String s, int n) {
        System.out.println("qestion 23 시저 암호");

        String answer = "";

        int str;
        for (int i = 0; i < s.length(); i++) {
            str = (int) s.charAt(i);
            if(!((str >= 65 && str <=90) || (str>=97 && str <=122))) {
                answer += (char) str;
                continue;
            }

            str += n;
            if (str > 122 || ((str < 97) && (str > 90))){
                str -= 26;
            }
            answer += (char)str;
        }
        return answer;
    }
}
