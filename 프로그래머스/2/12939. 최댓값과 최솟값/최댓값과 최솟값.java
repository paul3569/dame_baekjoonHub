class Solution {
    public String solution(String s) {
        String answer = "";
        String maxN = "";
        String minN = "";
        
        String nums[];
        
        nums = s.split(" ");
        
        int cnt = 0;
        
        for(String a : nums){
            if(cnt == 0){
                maxN = a;
                minN = a;
            } else {
                if(Integer.valueOf(maxN) < Integer.valueOf(a)){
                    maxN = a;
                } else if(Integer.valueOf(minN) > Integer.valueOf(a)) {
                    minN = a;
                }             
            }
            cnt ++;
        }
        
        answer = minN + " " + maxN;
        
        return answer;
    }
}