import java.lang.reflect.Array;
import java.util.*;

public class Q19 {

    public static void main(String args[]) {
        Q19 q19 = new Q19();
        q19.solution(new String[]{"sun", "bed", "car"}, 1);
        q19.solution(new String[]{"abce", "abcd", "cdx"}, 2);
        q19 = null;
    }

    public String[] solution(String[] strings, int n) {
        System.out.println("==============");
        System.out.println("qestion 19 문자열 내 마음대로 정렬하기");


        String[] answer = {};
        LinkedHashMap<String, String> hsmp = new LinkedHashMap<>();

        for(String str : strings){
            hsmp.put(str.charAt(n) + str, str); //sun usun
        }


        ArrayList<String> keyset = new ArrayList<>(hsmp.keySet());
        Collections.sort(keyset);

        answer = new String[keyset.size()];
        int i = 0;
        for(String key : keyset){
            System.out.print(hsmp.get(key) + " ");
            answer[i++] = hsmp.get(key);
        }
        System.out.println();


        return answer;
    }
}
