/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambios;

/**
 *
 * @author JAIRO PINEDA
 */
public class Calculos {
    //variables
    private double numero;
    private double resultado;
    private int divisaentrada;
    private int divisasalida;
    
    //constructor
    public Calculos(){
        
    }
    
    //metodos set y get

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public int getDivisaentrada() {
        return divisaentrada;
    }

    public void setDivisaentrada(int divisaentrada) {
        this.divisaentrada = divisaentrada;
    }

    public int getDivisasalida() {
        return divisasalida;
    }

    public void setDivisasalida(int divisasalida) {
        this.divisasalida = divisasalida;
    }

    //calculos  
    public double convertir(){
    //lempira a lempira
    if (divisaentrada==0 && divisasalida==0){
        resultado=numero*1;
    }    
    //lempira a dolares
    if (divisaentrada==0 && divisasalida==1){
        resultado=numero*0.041;
    }    
    //lempira a euros
    if (divisaentrada==0 && divisasalida==2){
        resultado=numero*0.035;
    }  
    
    //dolares a lempiras
    if (divisaentrada==1 && divisasalida==0){
        resultado=numero*24.51;
    }  
    //dolares a dolares
    if (divisaentrada==1 && divisasalida==1){
        resultado=numero*1;
    }  
    //dolares a euros
    if (divisaentrada==1 && divisasalida==2){
        resultado=numero*0.85;
    }  
    //euros a lempiras
    if (divisaentrada==2 && divisasalida==0){
        resultado=numero*28.67;
    }  
    //euros a dolares
    if (divisaentrada==2 && divisasalida==1){
        resultado=numero*1.17;
    }  
    //euros a euros
    if (divisaentrada==2 && divisasalida==2){
        resultado=numero*1;
    }  
        return resultado;
    }
    
}
