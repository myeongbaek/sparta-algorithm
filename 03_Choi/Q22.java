public class Q22 {

    public static void main(String args[]) {
        Q22 q22 = new Q22();
        int result = q22.solution("one4seveneight");
        System.out.println(result);
        q22.solution("23four5six7");
        q22.solution("2three45sixseven");
        q22.solution("123");
        q22 = null;
    }

    public int solution(String s) {
        System.out.println("qestion 22 숫자 문자열과 영단어");
        final String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        final String[] alphabetNumbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String response = null;

        for(int i = 0; i < 10; i++){
            response = s.replace(alphabetNumbers[i], numbers[i]);
        }
        System.out.println(response);

        return Integer.parseInt(response);
    }

}
