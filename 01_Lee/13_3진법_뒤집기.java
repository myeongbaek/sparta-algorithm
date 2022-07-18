class Solution {
    public int solution(int n) {
        int answer = 0;
        String base3 = "";
        String[] stringArray ={};
        String result = "";

        base3 = Integer.toString(n, 3);
        char[] charArray = base3.toCharArray();

        for(int i=charArray.length-1; i>=0; i--){
            result += String.valueOf(charArray[i]);
        }

        answer = Integer.parseInt(result, 3);

        return answer;
    }
}
