public static String solution(String s) {
    String answer = "";
    String[] array1 = s.split("");
    int index = 0;

    for(int i=0; i<array1.length; i++){
        if(array1[i].equals(" ")){
            index = 0;
            answer += " ";
        } else if (index % 2 == 0) {
            answer += array1[i].toUpperCase();
            index++;
        } else {
            answer += array1[i].toLowerCase();
            index++;
        }
    }

    return answer;
}
