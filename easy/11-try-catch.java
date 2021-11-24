import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner entrada = new Scanner(System.in);
        try{
            int a = entrada.nextInt();
            int b = entrada.nextInt();
            System.out.println(a/b);
        }catch(Exception e ){
            String message = e.getClass().getName().equals("java.lang.ArithmeticException") ? e.toString() : e.getClass().getName();
            System.out.println(message);
        }
    }
}
