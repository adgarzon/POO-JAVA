/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1.ejer1java;
import java.util.Scanner;
/**
 *aplicativo para calcular el informe de ventas del dia de un vendedor minorista
 * @author Duvan
 * @version 12-09-2020
 */
public class Ejercico1 {

    /**
     * metodo principal-inicia la ejecucion del aplicativo
     * @param arg -lista de parametros del metoddo tipo string
     */
    public static void main(String arg[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("----BIENVENIDOS-----\n");
        int tam;
        System.out.println("Cuantas compras desea ingresar: \t");
        tam = entrada.nextInt();
        String []A = new String[tam];
        double []B = new double[tam];
        int []C = new int[tam];
        
        for(int i=1;i<tam+1;i++){
            System.out.println("Ingrese la "+i+" compra: \n");
            entrada.nextLine();
            System.out.println("Codigo: ");
            A[i-1] = entrada.nextLine();
            System.out.println("Precio unitario: \t");
            B[i-1] = entrada.nextDouble();
            System.out.println("Cantidad: \t");
            C[i-1] = entrada.nextInt();
            for (int f = 0; f < 50; ++f) System.out.println(""); 
        }
         
        System.out.println("\n-------------INFORME-------------");
        System.out.println("Total productos vendidos en el dia: "+tam);
        System.out.println("Total ingresos en el dia: "+ingresos(C,B,tam));
        System.out.println("El producto mas vendido es: "+pMasVendido(A,C,tam));
        System.out.println("El producto mas costoso vendido es: "+pCostoso(A,B,tam));
     
    }
    
    /**
     * Metodo para calcular los ingresos diarios
     * @param c - recibe las cantidades de los productos
     * @param b - recibe los precios de los productos
     * @param t - recibe el numero de compras
     * @return - retorna la sumatoria de ingresos por producto
     */
    public static double ingresos(int c[],double b[],int t){
        double sum = 0;
        for(int i=0;i<t;i++){
            sum += b[i]*c[i];
        }
        return sum;
    }
    /**
     * Metodo para saber cual fue el producto mas vendido
     * @param a - recibe el codigo de los productos
     * @param c - recibe la cantidad de unidades de cada producto
     * @param t - recibe la cantidad de compras
     */
    public static String pMasVendido(String a[],int c[],int t){
        
        int max = c[0];
        int pos = 0;
        for(int  i=0;i<t;i++){
            if(max<c[i]){
                max =c[i];
                pos = i;
            }
        }
        String p = a[pos];
        return p;
    }
    public static String pCostoso(String a[],double b[],int t){
        double max = b[0];
        int pos = 0;
        for(int  i=0;i<t;i++){
            if(max<b[i]){
                max =b[i];
                pos = i;
            }
        }
        String p = a[pos];
        return p;
    }
   
}
