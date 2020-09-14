/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1.ejer1java;
import java.util.Scanner;
/**
 *Aplicativo para determinar exceso de credito de un cliente en una tienda
 * @author Duvan
 * @version 13-09-2020
 */
public class Ejercicio2 {
    /**
     * metodo principal- ejecucion del programa
     * @param arg - parametros del metodo principal
     */
    public static void main(String arg[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println(".::BIENVENIDOS::.\n");
        int tam;
        System.out.println("Clientes a registrar: ");
        tam = entrada.nextInt();
        int []sInicial = new int[tam];
        int []tAbono = new int [tam];
        int []tCredito = new int [tam];
        int []limCredito = new int[tam];
        int []nSaldo = new int[tam];
        
        for(int i=0;i<tam;i++){
            System.out.printf("Cliente %d:\n",i+1);
            System.out.println("Saldo inicial: ");
            sInicial[i] = entrada.nextInt();
            System.out.println("Total de abonos en el mes: ");
            tAbono[i] = entrada.nextInt();
            System.out.println("Total de creditos aplicados a la cuenta: ");
            tCredito[i] = entrada.nextInt();
            System.out.println("Limite de credito permitido: ");
            limCredito[i] = entrada.nextInt();
            for (int f = 0; f < 40; ++f) System.out.println(""); 
        }
        nSaldo=nBalance(sInicial,tAbono,tCredito,limCredito,tam);
        for(int i=1;i<tam+1;i++){
            if(nSaldo[i-1]<limCredito[i-1]){
                System.out.println("El cliente numero "+i+" ha excedido el limite de credito");
            }
        }
        
    }
    /**
     * Metodo para calcular el nuevo valance para cada cliente
     * @param sIni - recibe los saldos iniciales de los clientes
     * @param abono - recibe los abonos de cada cliente
     * @param credito - recibe el total de credito de cada cliente
     * @param lim - recibe el limite de credito para cada cliente
     * @param t - recibe el numero de clientes
     */
     public static int[] nBalance(int sIni[], int abono[],int credito[],int lim[],int t){
         int []balance = new int[t];
         for(int i=0;i<t;i++){
             balance[i] = sIni[i]+abono[i]-credito[i];
         }
        return balance;
    }
}
