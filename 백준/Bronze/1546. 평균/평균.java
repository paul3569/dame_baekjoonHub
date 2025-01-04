import java.util.*;

public class Main {
    
    public static void main(String[] args){
        
        Scanner scr = new Scanner(System.in);
        int len = scr.nextInt();
        double scoreList[] = new double[len];
        
        for(int i = 0; i < scoreList.length; i++) {
        	scoreList[i] = scr.nextDouble();
		}
        scr.close();
        
        
        double maxScore = Arrays.stream(scoreList).max().getAsDouble();
        
        
        double sum = 0;
        
        for(int i=0; i<len; i++){
            sum += scoreList[i] / maxScore * 100;
            
        }
        
        System.out.print(sum / len);
        
        
    }
    
    
}