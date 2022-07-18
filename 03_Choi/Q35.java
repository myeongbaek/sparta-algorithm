public class Q35 {
    public static void main(String args[]) {
        Q35 q35 = new Q35();
        q35.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
        q35.solution(6, new int[]{46, 33, 33 ,22, 31, 50}, new int[]{27 ,56, 19, 14, 14, 10});
        q35 = null;
    }
    public String[] solution(int n, int[] arr1, int[] arr2) {
        System.out.println("qestion 35 [1차] 비밀지도");

        String val1 = "", val2 = "", result = "";
        String[] answer = new String[n];

        for(int i = 0; i < n; i++) {
            val1 = String.format("%0" + n + "d",  Integer.parseInt(Integer.toBinaryString(arr1[i])));
            val2 = String.format("%0" + n + "d",  Integer.parseInt(Integer.toBinaryString(arr2[i])));
            System.out.println(val1 + " " + val2);

            for(int j = 0; j < n; j++){
                result += (tOrF(val1.charAt(j)) || tOrF(val2.charAt(j))) ? "#" : " ";
            }
            System.out.println(result);

            answer[i] = result;
            result = "";
        }

        for(int i = 0; i < n; i++)
            System.out.println(answer[i]);

        return answer;
    }

    public boolean tOrF(char val){
        if(val == (char)'0') return false;
        else return true;
    }
}
