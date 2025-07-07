import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String strArr[];
        strArr = s.toLowerCase().split("");
        boolean flag = false;
        int cnt = 0;
        for(String str : strArr){
            if(flag || cnt == 0) {
                str = str.toUpperCase();
                cnt ++;
            }
            answer += str;
            flag = (str.equals(" ")) ? true : false;
        }
        return answer;
    }
}