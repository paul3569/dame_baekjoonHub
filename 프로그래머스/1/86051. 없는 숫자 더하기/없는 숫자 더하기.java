import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i : numbers){
            map.put(i,i);
        }
        
        for(int i=1; i<10; i++){
            answer -= map.getOrDefault(i, 0);
        }
        
        
        return answer;
    }
}