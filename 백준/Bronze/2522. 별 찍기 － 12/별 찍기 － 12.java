
import java.util.*;

public class Main {
    
    public static void main(String[] args){
        
        Scanner scr = new Scanner(System.in);
        int len = scr.nextInt();

        for(int i=1; i<=len; i++) {
        	
        	for(int j=len; j > i; j--) {
        		System.out.print(" ");
        	}
//        	3-1 = 2	1개	2가 1보다 작을때 실행	=> *1개
//        	3-2 = 1	2개	
//        	3-3 = 0	3개

        	for(int j=len-i; j<len; j++) {
        		System.out.print("*");
        	}
        	System.out.println(" ");
        	
        }
        
//        3
//        2
        
        for(int i=len; i>1; i--) {
        	
        	for(int j=len; j>=i; j--) {
        		System.out.print(" ");
        	}
        	
        	for(int j=i; j>1; j--) {
        		System.out.print("*");
        	}
        	System.out.println("");
        }
        
    }
    
    
}