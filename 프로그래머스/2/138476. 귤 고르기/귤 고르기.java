import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        Map<Integer, Integer> m = new HashMap<>();
        
        // Hash에 종류별로 담기.
        for(int i : tangerine){
            m.put(i, (m.getOrDefault(i, 0) + 1));
        }

        // value의 내림차순으로 정렬
        List<Integer> list = new ArrayList<>(m.values());
        Collections.sort(list, Collections.reverseOrder());
        
        int cnt = 0;
        for(int i : list){
            if((cnt + i) >= k) {
                answer ++;
                break;
            } else {
                cnt += i;
                answer ++;
            }
        }
            
            
        
        return answer;
    }
}