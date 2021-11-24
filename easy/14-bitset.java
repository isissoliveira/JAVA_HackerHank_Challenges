import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner entrada = new Scanner(System.in);
        String[] operacao;
        
        Integer Tamanho = entrada.nextInt();
        Integer QtdOperacoes = entrada.nextInt();
        entrada.nextLine();

        BitSet B1 = new BitSet(Tamanho);
        BitSet B2 = new BitSet(Tamanho);
        
        for(int i=0; i<QtdOperacoes; i++ ){
            operacao = entrada.nextLine().split(" ");
            
            switch(operacao[0]){
                case "AND":
                    if(operacao[1].equals("1")){
                        B1.and(B2);
                    }else{
                        B2.and(B1);
                    }
                    break;
                    
                case "SET":                 
                    if(operacao[1].equals("1")){     
                       B1.set(Integer.parseInt(operacao[2]));
                    }else{
                        B2.set(Integer.parseInt(operacao[2]));
                    }
                    break;
                    
                case "FLIP":
                    if(operacao[1].equals("1")){
                       B1.flip(Integer.parseInt(operacao[2]));
                    }else{
                        B2.flip(Integer.parseInt(operacao[2]));
                    }
                    break;
                    
                case "OR":
                    if(operacao[1].equals("1")){
                        B1.or(B2);
                    }else{
                        B2.or(B1);
                    }
                    break;
                    
                case "XOR":
                    if(operacao[1].equals("1")){
                        B1.xor(B2);
                    }else{
                        B2.xor(B1);
                    }
                    break;               
            }
            /*System.out.println(B2.get(0));
            System.out.println(B2.get(1));
            System.out.println(B2.get(2));
            System.out.println(B2.get(3));
            System.out.println(B2.get(4));*/
            System.out.println(B1.cardinality() +" "+ B2.cardinality()); 
            
        }

        
    }
}
