import java.util.*;

class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        
        StringBuilder sb = new StringBuilder();
        
        
        
        String st = String.valueOf(n);
        
        answer = new int[st.length()];
        
        int j = 0;
        
        for(int i = st.length()-1; i>=0; i--){
            answer[j] = Integer.parseInt(String.valueOf(st.charAt(i)));
            j++;
        }
        return answer;
    }
}