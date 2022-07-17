import java.util.*;

public class Q19 {

    public String[] solution(String[] strings, int n) {
        System.out.println("qestion 19 문자열 내 마음대로 정렬하기");


        String[] answer = {};

        HashMap<String, String> hsmp = new HashMap<String, String>();

        for(String str : strings){
            hsmp.put(str.substring(n), str);
        }

        List<String> keyset = new ArrayList<>(hsmp.keySet());
        Collections.sort(keyset);

        for(String key : keyset){
            System.out.print(hsmp.get(key) + " ");
        }
        System.out.println();

        return answer;
    }
}
