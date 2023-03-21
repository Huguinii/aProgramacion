package SegundaEvaluacion;


/**
 * Write a description of class ExplicaFor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExplicaFor
{
    public static void main(String[]args){
        Alumno[] clase=new Alumno[30];
        Alumno alumnito1=new Alumno("Jose");
        alumnito1.addNotas(3);
        alumnito1.addNotas(4);
        Alumno alumnito2=new Alumno("Hugo");
        alumnito2.addNotas(3);
        alumnito2.addNotas(3);
        Alumno alumnito3=new Alumno("El sobrao");
        alumnito3.addNotas(10);
        alumnito3.addNotas(10);
        alumnito3.addNotas(5);
        clase[0]=alumnito1;
        clase[1]=alumnito2;
        clase[2]=alumnito3;
        
        int media=0;
        int numNotas=0;
        for(Alumno alumnillo:clase){
            if(alumnillo!=null){
            media=0;
            numNotas=0;
            for (int notita: alumnillo.getNotas()){
                media+=notita;
                numNotas++;
            }
            System.out.println(alumnillo.getNombre()+" "+media/numNotas);
        }
        }
        
        
    }
}
