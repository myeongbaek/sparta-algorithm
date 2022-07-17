public class Q7 {
    public int[] solution(int n){
        String a = String.valueOf(n);
        int[] result = new int[a.length()];

        for(int i = 0; i < a.length(); i++){
            result[i] = (int)(n % 10);
            n = (int)(n / 10);
        }

        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }

        return result;
    }


}
