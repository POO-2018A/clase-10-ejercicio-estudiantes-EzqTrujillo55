
package estudiantes;

/**
 *
 * @author ESFOT
 */
public class Principal {
    
    
    
     public static void main(String[] args) {
        // TODO code application logic here
        Estudiantes[] estudiantes=new Estudiantes[3]; 
       int tamanioEstudiantes=estudiantes.length; 
       
       
       //2 materias
        estudiantes[0]=new Estudiantes("Juan", "Pérez","1234567890"); //Aqui va el constructor con los parametros 
       String[]m={"m1","m2"}; 
       estudiantes[0].setMaterias(m);
      
       
       
    
        //3 materias
        estudiantes[1]=new Estudiantes("María", "Castro","0987654321"); //Aqui va el constructor con los parametros
        String[]m2={"m2","m3","m4"};
        estudiantes[1].setMaterias(m2); 
        
       
               
        //4 materias
        estudiantes[2]=new Estudiantes("Pedro", "Velasco","2065758591"); //Aqui va el constructor con los parametros
        String[]m3={"m2","m3","m4","m5"};
        estudiantes[2].setMaterias(m3);
        
        
       
        
       System.out.println("##### INFORMACIÓN ESTUDIANTES #####");
       for(int i=0; i<tamanioEstudiantes;i++){ 
       System.out.println("##Estudiante :" + (i+1));
       System.out.println("Nombre completo: " + estudiantes[i].getNombre() + " " + estudiantes[i].getApellido()); 
       System.out.println("Cédula: " + estudiantes[i].getCedula());
       System.out.println("Materias: ");
      String materiasEstudiante []= estudiantes[i].getMaterias(); 
       String[]me= estudiantes[i].getMaterias(); 
       for(int j=0; j<me.length; j++){
           System.out.println( (j+1) + "." + materiasEstudiante[j] + " ");
       }       
           System.out.println(); 
    }
       
       int c1=0;
       int c2=0;
       int c3=0;
       int c4=0;
       int c5=0;
       
     for(int i=0; i<tamanioEstudiantes;i++){ 
 
      String materiasEstudiante []= estudiantes[i].getMaterias(); 
       String[]me= estudiantes[i].getMaterias(); 
       for(int j=0; j<me.length; j++){
           if(materiasEstudiante[j]=="m1"){
           c1=c1+1; 
           }
           if(materiasEstudiante[j]=="m2"){
           c2=c2+1; 
           }
           if(materiasEstudiante[j]=="m3"){
           c3=c3+1;
           }
           if(materiasEstudiante[j]=="m4"){
           c4=c4+1;
           }
           if(materiasEstudiante[j]=="m5"){
           c5=c5+1; 
           }
       }              
    }
     
     System.out.println("####### RESUMEN MATERIAS #######"); 
     System.out.println("m1: " + c1); 
     System.out.println("m2: " + c2);
     System.out.println("m3: " + c3);
     System.out.println("m4: " + c4);
     System.out.println("m5: " + c5);
}
}
