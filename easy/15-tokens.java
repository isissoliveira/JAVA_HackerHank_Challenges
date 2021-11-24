import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] s2 = s.split("");
        String aux="";
        ArrayList<String> tokens = new ArrayList<String>();
        
        // ASCII   entre 65 e 90    ou    97 a 122
        for (int i = 1; i< s2.length; i++){
            if( ( (int)s2[i].charAt(0) >=65 && (int)s2[i].charAt(0) <=90) || ( (int)s2[i].charAt(0) >=97 && (int)s2[i].charAt(0) <=122) ){
                aux+=s2[i];
            }else if(!aux.isEmpty()){
                tokens.add(aux);
                aux = "";
            }            
        }
        if(!aux.isEmpty()){
            tokens.add(aux);
            aux = "";
        }           
        
        System.out.println(tokens.size());
        for (int i = 0; i< tokens.size(); i++){
            System.out.println(tokens.get(i));    
        }       
               
        scan.close();
    }
}
