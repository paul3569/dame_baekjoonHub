class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int cnt = 0;
        int stCnt = 0;
        
        while(cnt < s.length()){
            if(stCnt < 0){
                answer = false;
                break;
            }
            if(cnt == 0 && String.valueOf(s.charAt(cnt)).equals(")")){
                answer = false;
                break;
            } else {
                if(cnt == 0) {
                    stCnt ++;
                } else if(String.valueOf(s.charAt(cnt)).equals("(") && stCnt >= 0){
                    stCnt ++;
                } else {
                    stCnt --;
                }
                cnt ++;
            }
        }
        if(stCnt > 0){
            answer = false;
        }

        return answer;
    }
}