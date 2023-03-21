package Condicionales;

public class Hora2{ 

    int hora, minutos; 

    //Constructor 

    public Hora2(int hora, int minutos){ 

        this.hora=hora; 

        this.minutos=minutos; 

    } 

    public void mostrar(){ 

        System.out.println(hora + " : " + minutos); 

    } 

    public void incrementarHora(int hora){ 

        this.hora=this.hora+hora%24; 

    } 

    public void incrementarMinuto(int minutos){ 

        if (this.minutos+minutos>59) { 

            incrementarHora(minutos/60); 

            this.minutos= this.minutos + minutos%60; 

        } else { 

            this.minutos+=minutos; 

        } 

    } 

} 