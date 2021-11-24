import java.util.Scanner;

class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
    public long power(int n1, int n2) throws Exception{
        if( n1 < 0 || n2 < 0 ){
            throw new Exception("n or p should not be negative."); 
        }else if( n1 == 0 && n2 == 0){
            throw new Exception("n and p should not be zero."); 
        }
        return myPow( n1,  n2);
        
    }
    private Long myPow( int a, int b){
        if( b == 0){
            return 1L;
        }
        return  a * ( myPow(a, b-1));
    }
}

public class Solution {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
