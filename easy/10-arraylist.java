import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int nQtdLinhasComInteiros= Integer.parseInt(scan.nextLine());
       // System.out.println(nQtdLinhasComInteiros);
   
        ArrayList<String> listadosInteiros = new ArrayList<String>();
        ArrayList<String> listadasQueries = new ArrayList<String>();
                
        for(int i=0; i< nQtdLinhasComInteiros; i++){
            listadosInteiros.add( scan.nextLine());
            //System.out.println(listadosInteiros.get(i));
        }
      
        int nQtdQueries = Integer.parseInt(scan.nextLine());
        //System.out.println(nQtdQueries);
        
        for(int i=0; i< nQtdQueries; i++){
            String[] aux = new String[2];
            aux = scan.nextLine().split(" ");

            try{
                String linhaInteiros = listadosInteiros.get( Integer.parseInt(aux[0]) -1 );
                //System.out.println(iTemlistaInteiros);
                String item = linhaInteiros.split(" ")[ Integer.parseInt(aux[1]) ];
                System.out.println(item);
                }
            catch(Exception e){
                System.out.println("ERROR!");
            }
            
        }  
    }
}
