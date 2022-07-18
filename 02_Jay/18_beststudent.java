class Solution {
    public int[] solution(int[] n) {
        int[] A= {1, 2, 3, 4, 5};
        int[] B= {2, 1, 2, 3, 2, 4, 2, 5};
        int[] C= {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int []result = new int[3];

        int result_length=0;

        int result_A =0;
        int result_B =0;
        int result_C =0;

        for(int i=0; i<n.length; i++) {
            if(n[i] == A[i%A.length] ) {
                result_A++;
            }
        }

        for(int i=0; i<n.length; i++) {
            if(n[i] == B[i%B.length] ) {
                result_B++;
            }
        }

        for(int i=0; i<n.length; i++) {
            if(n[i] == C[i%C.length] ) {
                result_C++;
            }
        }

        //abc

        if(result_A == result_B && result_C == result_A) {
            result[0] = 1;
            result[1] = 2;
            result[2] = 3;

        }

        // ab

        if(result_A == result_B && result_A > result_C) {
            result[0] = 1;
            result[1] = 2;
        }


        //ac
        if(result_A == result_C && result_A > result_B) {
            result[0] = 1;
            result[1] = 3;

        }

        //bc
        if(result_B == result_C && result_B > result_A) {
            result[0] = 2;
            result[1] = 3;

        }
        //1
        int temp = Math.max(result_A, result_B);
        int highest = Math.max(temp, result_C);

        if(highest == result_A) {
            result[0] = 1;

        }else if(highest == result_B) {
            result[0] = 2;

        }else {
            result[0] = 3;

        }

        for(int i=0; i<3; i++) {
            if(result[i] !=0) {
                result_length++;
            }else {
                break;
            }
        }
        int []result2 = new int [result_length];

        for(int i=0; i<result2.length; i++) {
            result2[i] = result[i];
        }

       return result2;
    }
}

