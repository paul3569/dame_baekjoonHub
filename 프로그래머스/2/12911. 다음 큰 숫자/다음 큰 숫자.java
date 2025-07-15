class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 1;
        String iN = "";
        String iM = "";
        int cnt1 = 0;
        int cnt2 = 0;
        
        while(true){
            
            iN = Integer.toBinaryString(n);
            iM = Integer.toBinaryString(n+i);
            
            for(int k=0; k<iN.length(); k++){
                if(iN.charAt(k) == '1') cnt1++;
            }
            for(int k=0; k<iM.length(); k++){
                if(iM.charAt(k) == '1') cnt2++;
            }
            
            if(cnt1 == cnt2){
                answer = n+i;
                break;
            } else {
                cnt1 = 0;
                cnt2 = 0;
                i++;
            }

        }
        return answer;
    }
}