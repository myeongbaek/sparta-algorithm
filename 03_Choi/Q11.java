public class Q11 {
    public int solution(int n){
        System.out.println("==============");
        System.out.println(n);

        long value = n;

        int cnt = 0;

        while(value > 1) {

            if ((int) (value % 2) == 0)
                value /= 2;
            else
                value = 3 * value + 1;
            cnt++;
            System.out.println(value);

        };

        if(cnt >= 500)
            return -1;
        else
            return cnt;

    }
}
