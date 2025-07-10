class Solution {
    int cnt = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers,target,0,0);
        return cnt;
    }
    
    
    // 배열, 타겟, 뎁스, 이전 뎁스 까지의 합계
    public void dfs(int[] nums, int t, int depth, int result){
        if(depth == nums.length){
            if(result == t){
                cnt++;
            }
            return;
        }
        
        dfs(nums, t, depth+1, result+nums[depth]);
        dfs(nums, t, depth+1, result-nums[depth]);
        
        
    }
}