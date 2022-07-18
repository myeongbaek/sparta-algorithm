class Solution {
    public long solution(long n) {
        long answer = 0;
        double sqrt = Math.sqrt(n);
        double number = 0;

        if(sqrt == (int)sqrt){
            number = sqrt+1;
            answer = (long)Math.pow(number, 2);
        } else {
            answer = -1;
        }

        return answer;
    }
}
