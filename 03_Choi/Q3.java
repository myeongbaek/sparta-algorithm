public class Q3 {
    public String solution(int n){
        System.out.println("qestion 3 수박수박수박수박수박수?");

        String result = "";
        if(n > 10000)
            return result;

        for(int i = 0; i < n; i++){
            if(i % 2 == 0)
                result += "수";
            else
                result += "박";
        }

        return result;
    }
}
