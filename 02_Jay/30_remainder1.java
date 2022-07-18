class Solution {
    public int solution(int n) {
        for (int i=1;i<1000001;i++){
            if (n%i == 1){
                return i;
            }
            
        }
        return 0;
    }
}