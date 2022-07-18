import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q8 {
    public static void main(String args[]) {

        Q8 q8 = new Q8();
        System.out.println(q8.solution(118372));

        q8 = null;
    }

    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        List<Character> response = str.chars()
                .mapToObj(value -> (char) value)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());


        return Long.parseLong(response.toString());
    }

    private class SolutionTest {
//                Assertions.assertThat(response).isEqualTo(873211);

    }

}

