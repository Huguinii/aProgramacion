package SegundaEvaluacion.Clases;


/**
 * Write a description of class Generador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Generador
{
    public static void main(String[]args){
        Alumno alumnito1 = new Alumno(1, "Mariano","Romedal");
        alumnito1.hablar();
        //alumnito1.setNombre("Mariana");
        //alumnito1.hablar();
        Alumno alumnito2;
        for(int id=2; id<11; id++){
            alumnito2= new Alumno(id, "Mariano"+id, "Romedal"+id);
            alumnito2.hablar();
            System.out.println("mi id es: "+alumnito2.getidAlumno()+" y mi apellido es "+alumnito2.getApellido());
            System.out.println(alumnito2.hashCode());
        }
        
    }
}
//lee datos de alumnos separados por ; hasta que encuentre en el nombre //
//crear objetos alumnos y mostrar la informacion por cada uno de ellos