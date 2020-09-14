/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1.ejer4;
import java.util.Scanner;
/**
 *Aplicativo para calcular sueldo bruto de empleados
 * @author Duvan
 * @version 13-09-2020
 */
public class Ejercicio4 {
    public static void main(String arg[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println(".::BIENVENIDOS::.\n");
        int num;
        System.out.println("Numero de empledos: ");
        num = entrada.nextInt();
        String []nombre = new String[num];
        int []hTra = new int[num];
        double []tarifa = new double[num];
        for(int i=0;i<num;i++){
            entrada.nextLine();
            System.out.printf("Nombre de empleado %d:\t",i+1);
            nombre[i] = entrada.nextLine();
            System.out.println("Horas trabajadas: ");
            hTra[i] = entrada.nextInt();
            System.out.println("Tarifa por hora: ");
            tarifa[i] = entrada.nextDouble();
            for (int f = 0; f < 40; ++f) System.out.println("");
        }
        System.out.println(".::SUELDOS::.");
        for(int i=0;i<num;i++){
            System.out.println(nombre[i]+"\t"+sueldo(hTra,tarifa,num)[i]);
        }
    }
    public static double[] sueldo(int horas[],double tar[],int t){
    double []suel = new double[t];
    for(int i=0;i<t;i++){
        if(horas[i]>40){
            suel[i] = horas[i]*(tar[i]*1.5);
        }else{
            suel[i] = horas[i]*tar[i];
        }
    }
    return suel;
    }
}
