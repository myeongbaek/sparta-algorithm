import java.util.HashMap;

public class Q4 {
    public String solution(String[] participant, String[] completion) {
        System.out.println("qestion 4 완주하지 못한 선수\n");

        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}
