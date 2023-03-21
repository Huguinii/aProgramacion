package SegundaEvaluacion;

import java.util.Scanner; 
public class ArrayEnteros 

{ 
    // instance variables - replace the example below with your own 
    private int[] enteros;  
    private int size; // tamaño lógico del array 
    /** 
     * Constructor for objects of class ArrayEnteros 
     */ 
    public ArrayEnteros(int tamano) 
    { 
        // initialise instance variables 
        enteros = new int[tamano]; 
        size= 0; 
    } 
    public int  searchPos(int elementoAbuscar){ 
        boolean encontrado=false; 
        int pos = 0; 
        while(pos<size && !encontrado){ 
            if(enteros[pos]==elementoAbuscar) { 
                encontrado= true; 
                return pos; 
            } 
            pos++; 
        } 
        return -1; 
    } 
    public boolean add(int elementoAbuscar){ 
        if(searchPos(elementoAbuscar)==-1){ 
            if(!(size+1>enteros.length)){ 
                enteros[size]=elementoAbuscar; 
                size++; 
                return true; 
            } 
            return false; 
        } 
        return false; 
    }
    public int getSize(){
        return size;
    }
    public double media(){
        int acumulador=0;
        
        for (int cont=0; cont<size;cont++){
            acumulador+= enteros[cont];
        }   
        return ((double)acumulador)/size;
    }
    
    
} 