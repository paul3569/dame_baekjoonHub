import java.util.*;

public class Main{

    public static void main(String[] args){
        
        Scanner scr = new Scanner(System.in);
        
        int tot = scr.nextInt();
        
        int sum9 = 0;
        
        for(int i=0; i<9; i++){
            sum9 += scr.nextInt();
        }
        
        int result = tot - sum9;
    
        System.out.println(result);
    
    }


}