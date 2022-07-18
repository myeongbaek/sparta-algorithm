public class Q38 {

    public static void main(String args[]) {

        int[][] board = new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = new int[]{1, 5, 3, 5, 1, 2, 1, 4};
        Q38 q38 = new Q38();
        System.out.println(q38.solution(board, moves));
    }

    public int solution(int[][] board, int[] moves) {
        System.out.println("==============");
        System.out.println("qestion 38 크레인 인형뽑기 게임");


        int[] basket = new int[moves.length];
        int pick = 0, basketIndex = 0, answer = 0;


        for (int move : moves) {
            pick = 0;

            for (int i = 0; i < board[0].length; i++) {
                if (board[i][move - 1] != 0) {
                    pick = board[i][move - 1];
                    board[i][move - 1] = 0;
                    break;
                }
            }

            if(pick == 0)
                continue;

            // pop or append
            if (basketIndex != 0) {
                if (pick == basket[basketIndex - 1]) {
                    // pop
                    basket[basketIndex - 1] = 0;
                    basketIndex--;
                    answer += 2;
                }
                else{
                    // append
                    basket[basketIndex++] = pick;
                }
            } else {
                // append when the basket is empty
                basket[basketIndex++] = pick;
            }

        }


        return answer;
    }

}
