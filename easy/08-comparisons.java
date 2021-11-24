import java.util.Scanner;

public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
              
        for( int j=0 ; j< s.length()-( k - 1 ); j++){
            if( smallest.isEmpty() || s.substring(j, j+k).compareTo(smallest) < 0 ){
                smallest = s.substring(j, j+k);
            }
            if( largest.isEmpty() || s.substring(j, j+k).compareTo(largest) > 0 ){
                largest = s.substring(j, j+k);
            }
        }
        
        return smallest + "\n" + largest;
    }
  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}  
