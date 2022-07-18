class Solution {
        int solution(String dartResult) {
        int answer = 0;

        int[] arr = new int[3];
        int index = 0;
        String temp = "";

        for(int i=0; i<dartResult.length(); i++){
            switch (dartResult.charAt(i)) {
                case '*':
                    arr[index-1] *= 2;
                    if(index>1){
                        arr[index-2] *= 2;
                    }
                    break;
                case '#':
                    arr[index-1] *= -1;
                    break;
                case 'S':
                    arr[index] = (int)Math.pow(Integer.parseInt(temp),1);
                    temp = "";
                    index++;
                    break;
                case 'D':
                    arr[index] = (int)Math.pow(Integer.parseInt(temp),2);
                    temp = "";
                    index++;
                    break;
                case 'T':
                    arr[index] = (int)Math.pow(Integer.parseInt(temp),3);
                    temp = "";
                    index++;
                    break;
                default:
                    temp += String.valueOf(dartResult.charAt(i));
                    break;
            }
        }
        for(int j=0; j<arr.length; j++){
            answer += arr[j];
        }

        return answer;
    }
}
