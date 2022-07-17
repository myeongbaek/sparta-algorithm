public class Q1 {

    void solution(int a, int b) {
        System.out.println("qestion 1 2016년");

        String[] dayOfWeek = new String[]{"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int dayOfWeekIndex = 5;
        // 달이 29일 까지 인 경우 다음 달의 1일은 이전 달의 1일로부터 하루 미뤄집니다.
        // 30일 까지이면 이틀 미뤄지며 31일이면 삼일이 미뤄집니다.

        int day = 0;

        for(int i = 1; i < a; i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
                day += 3;
            else if(i == 4 || i == 6 || i == 9 || i == 11)
                day += 2;
            else if(i == 2)
                day += 0; // 2016년은 윤년
            else {
                System.out.println("잘못된 값이 입력되었습니다.");
                return;
            }
        }
        dayOfWeekIndex = ((day % 7) + (b % 7) + dayOfWeekIndex) % 7;

        System.out.println(dayOfWeek[dayOfWeekIndex]);

    }
}
