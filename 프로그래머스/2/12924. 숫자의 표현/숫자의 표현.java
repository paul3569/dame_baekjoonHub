/*
class Solution {
    public int solution(int n) {
        int answer = 0;
        int tempI = 0;
        for(int i=1; i<=n; i++){
            tempI = 0;
            for(int j=i; j<=n; j++){
                tempI+=j;
                if(tempI == n){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}*/

class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++){
            int sum = 0;
            for(int j = i; j <= n; j++){
                sum += j;
                
                if(sum >= n){
                    if(sum == n) answer++;
                    break;
                }
            }
        }   

        return answer;
    }
}