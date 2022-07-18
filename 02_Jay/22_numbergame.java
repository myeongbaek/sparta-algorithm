import java.util.HashMap;

class Solution {
    public int solution(String s) {
        String answer_string = "";
        
        HashMap<String, String> threeWords = new HashMap<String, String>();
        HashMap<String, String> fourWords = new HashMap<String, String>();
        HashMap<String, String> fiveWords = new HashMap<String, String>();

        threeWords.put("one","1");
        threeWords.put("two","2");
        threeWords.put("six","6");
        
        fourWords.put("zero","0");
        fourWords.put("four","4");
        fourWords.put("five","5");
        fourWords.put("nine","9");

        fiveWords.put("three","3");
        fiveWords.put("seven","7");
        fiveWords.put("eight","8");

        for (int i=0; i<s.length(); i++){
            char each_char = s.charAt(i);
            if (Character.isDigit(each_char)){
                answer_string += each_char;
            }

            if (i>=2){
                String threeString = String.format("%c%c%c",s.charAt(i-2),s.charAt(i-1),s.charAt(i));
                if (threeWords.containsKey(threeString)){
                    answer_string += threeWords.get(threeString);
                }
            }
            if (i>=3){
                String fourString = String.format("%c%c%c%c",s.charAt(i-3), s.charAt(i-2),s.charAt(i-1),s.charAt(i));
                if (fourWords.containsKey(fourString)){
                    answer_string += fourWords.get(fourString);
                }         
            } 
            if (i>=4){
                String fiveString = String.format("%c%c%c%c%c",s.charAt(i-4), s.charAt(i-3), s.charAt(i-2),s.charAt(i-1),s.charAt(i));
                if (fiveWords.containsKey(fiveString)){
                    answer_string += fiveWords.get(fiveString);
                }              
            }
        }
        int answer = Integer.parseInt(answer_string);
        // int answer=0;
        return answer;
        }
    }

