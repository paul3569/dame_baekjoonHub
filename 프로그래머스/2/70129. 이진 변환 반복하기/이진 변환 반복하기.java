class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        String strR = "";
        int totCnt = 0;
        int totZero = 0;
        
        while(!s.equals("1")){
            
            int tempStrLen = s.replace("0", "").length();
            
            totZero += (s.length() - tempStrLen);
            
            s = Integer.toBinaryString(tempStrLen);
            totCnt ++;
        }
        answer[0] = totCnt;
        answer[1] = totZero;
        
        
        
        return answer;
    }
}