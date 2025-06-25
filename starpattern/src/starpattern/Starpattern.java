package starpattern;

public class Starpattern {

    public static void main(String[] args) {
        int n = 5;  
        int starCount = 1;  

        for (int i = 1; i <= n; i++) {
        
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  "); 
            }
            
   
            for (int k = 1; k <= starCount; k++) {
                System.out.print("* ");
            }
            
        
            System.out.println();
            
     
            starCount = starCount + 2;
        }
    }
}
