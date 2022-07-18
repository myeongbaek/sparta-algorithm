class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int right = 0;
        int zero = 0;

        for(int i : lottos){
            if(i == 0){
                zero += 1;
            }
            for(int j : win_nums){
                if(i == j){
                    right += 1;
                }
            }
        }

        answer[0] = (right+zero)>1? 7-(right+zero) : 6;
        answer[1] = right>1? 7-right : 6;

        return answer;
    }
}
