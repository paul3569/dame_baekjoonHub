class Solution {
    boolean[] visits;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        visits = new boolean[n];
        
        for(int i=0; i<n; i++){
            if(!visits[i]){
                answer++;
                dfs(i, computers, n);
            }
        }
        
        
        return answer;
    }
    
    //
    
    public void dfs(int i, int[][] c, int n){
        visits[i] = true;
        
        for(int j=0; j<n; j++){
            if(!visits[j] && c[i][j] == 1){
                dfs(j, c, n);
            }
        }
        
    }
    
}