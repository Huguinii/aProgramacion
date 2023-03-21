package Condicionales;
import java.util.Scanner;

/**
 * Write a description of class Reloj here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hora
{
    int hora;
    int minutos;
    public Hora(int hora, int minutos){
        if(validaHora(hora) && validaMinuto(minutos)){
            this.hora= hora;
            this.minutos = minutos;
        }else{
            this.hora=0;
            this.minutos=0;
        }
    }

    public void incrementarHora(int hora){
        if(hora>=0 && hora<25){
            if (this.hora+hora>23){
                this.hora=this.hora+hora-24;
            }else{
                this.hora+=hora;
            }
        }
    }

    public void incrementarMinuto (int minutos){
        if(hora>=0 && hora<60){
            if (this.minutos+minutos>59){
                this.minutos=this.minutos+minutos-60;
                incrementarHora(1);
            }else{
                this.minutos+=minutos;
            }
        }
    }

    public boolean validaHora(int hora){
        if(hora>=0 && hora<25){
            return true;
        }
        return false;
    }

    public void mostrar(){
        System.out.println(hora+":"+minutos);
    }

    public boolean validaMinuto(int minutos){
        if(minutos>=0 && minutos<61) return true;
        return false;
    }
    
}
//crear una clase que use la clase hora y que le asigne las horas de forma aleatoria y los minutos tambien