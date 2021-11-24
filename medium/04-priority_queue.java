
/*
 * Create the Student and Priorities classes here.
 */
import java.util.*;
class Student{
    private int id;
    private String name;
    private double cgpa;
    
    public Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    
    public int getId (){
        return this.id;
    }
    public String getName (){
        return this.name;
    }
    public double getCgpa (){
        return this.cgpa;
    }
}

class Priorities{
    public List<Student> getStudents( List<String> events){
        //   ENTER name CGPA id
        //ENTER John 3.75 50
        List<Student> estudantes = new ArrayList<Student>();
        StudentComparator sc = new StudentComparator();
        PriorityQueue<Student> pq = new PriorityQueue(1 , sc );
        
        String[] arrayOperacao;
        int qtdOperacoes = events.size();
        
        for( int i=0; i<qtdOperacoes; i++){
            arrayOperacao = events.get(i).split(" ");
            
            if( arrayOperacao[0].equals("ENTER")){
                pq.add( new Student( Integer.parseInt(arrayOperacao[3]) , arrayOperacao[1], Double.parseDouble(arrayOperacao[2]) ));             
            }
            else{
                pq.poll();
            }
        }
        
        int tam = pq.size();
        for( int i=0; i< tam; i++ ){
            estudantes.add(pq.poll());         
        }
        
        return estudantes;
           
    }   
}

class StudentComparator implements Comparator<Student> {
    
    @Override
    public int compare(Student a, Student b) {
        if( a.getCgpa() == b.getCgpa()){
            
            if( a.getName().equals(b.getName())){
                
                if(a.getId() < b.getId()){ // ORDEM ASCENDENTE DE ID
                    return -1;
                }
                else{
                   return 1; 
                }
            }
            return a.getName().compareTo( b.getName()); // ORDEM ALFABETICA
        }
        else{
            if(a.getCgpa() < b.getCgpa()){
                return 1;
            }else if(a.getCgpa() > b.getCgpa() ){ // ORDEM DECRESCENTE DE CGPA
                return -1;
            }else{
                return 0;
            }
        }
    }
    
    
}
