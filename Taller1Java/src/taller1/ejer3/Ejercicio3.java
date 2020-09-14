/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1.ejer3;
import java.util.Scanner;
/**
 *Aplicativo para pago a vendedores mediante comisiones
 * @author Duvan
 * @version 13-09-2020
 */
public class Ejercicio3 {
    /**
     * metodo principal - inia aplicativo
     * @param arg - parametros del metodo principal
     */
    public static void main(String arg[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println(".::BIENVENIDOS::.\n");
        int nArt;
        int suma=0;
        double pago;
        System.out.println("Numero de articulos vendidos: ");
        nArt = entrada.nextInt();
        int []articulos = new int[nArt];
        for(int i=0;i<nArt;i++){
            System.out.printf("Ingrese articulo %d \t",i+1);
            articulos[i] = entrada.nextInt();
        }
        for(int i=0;i<articulos.length;i++){
            suma += articulos[i];
        }
        pago = 200+(suma*0.09);
        System.out.println("Pago por la categoria A : "+catA(suma,pago));
        System.out.println("Pago por la categoria B : "+catB(suma,pago));
    }
    /**
     * Metodo para calcular pago por la primera categoria
     * @param sum - recibe el total de productos vendidos
     * @param pag - recibe el pago de la semana
     */
    public static double catA(int sum,double pag){
        
        if(sum>3000 & sum<5000){
            pag = pag+(sum*0.05);
        }else if(sum>=5000 & sum<=7000){
            pag = pag+(sum*0.07);
        }else  if(sum>7000){
            pag = pag+(sum*0.1);
        }
        return pag;
    }
    /**
     * Metodo para calcular pago por la segunda categoria
     * @param sum - recibe el total de productos vendidos
     * @param pag - recibe el pago de la semana
     * @return 
     */
    public static double catB(int sum,double pag){
        
        if(sum>5000 & sum<10000){
            pag = pag+(sum*0.07);
        }else if(sum>=10000 & sum<=15000){
            pag = pag+(sum*0.1);
        }else  if(sum>15000){
            pag = pag+(sum*0.13);
        }
        return pag;
    }
}
