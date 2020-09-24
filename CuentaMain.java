/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuentasCliente;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class CuentaMain {
    public static void main(String arg[]){
        Cuenta[] c = new Cuenta[10];
        Scanner en = new Scanner(System.in);
        int salir = 1;
        do{
            int opcion;
            System.out.println(".::MANEJO DE CUENTAS::.\n\n");
            System.out.println("1. Registrar cuenta");
            System.out.println(" 2. Retirar");
            System.out.println(" 3. Consignar");
            System.out.println(" 4. Tranferir");
            System.out.println(" 5. Consultar");
            System.out.println(" 6. salir");
            System.out.println("\n Digite su opcion: \t");
            opcion = en.nextInt();

            switch(opcion){
                case 1:
                    Scanner ent = new Scanner(System.in);
                    int num;
                    double saldo;
                    String numCuentas;
                    System.out.println("\n Numero de cuentas a registrar: \t");
                    num = ent.nextInt();
                    Cuenta[] cuen = new Cuenta[num];
                    if(num>10){
                           System.out.println("Numero de cuentas excedido");
                    }else{
                        
                        for(int i=0;i<cuen.length;i++){
                            ent.nextLine();
                            System.out.println("\n Numero de cuenta: \t");
                            numCuentas = ent.nextLine();
                            System.out.println("Saldo inicial: \t");
                            saldo = ent.nextDouble();

                            cuen[i] = new Cuenta(numCuentas,saldo); 
                        }
                    }
                    c=cuen;
                    
                    break;
                case 2:
                    retirarDin(c);
                    break;
                case 3:
                    consignarDin(c);
                    break;
                case 4:
                    /*tranferirDin(c);
                    break;*/
                case 5:
                    consultar(c);
                    break;
                default: 
                    System.out.println("Opcion fuera de rango");

            }
            System.out.println("volver al menu 1=si 0=no: \t");
            salir = en.nextInt();
        }while(salir==1);
        
    }
    
    public static void retirarDin(Cuenta cuen[]){
        
        Scanner ent = new Scanner(System.in);
        String nCuenta;
        boolean retirar = false;    
        double monto;
        System.out.println("Numero de cuenta de la que va retirar: \t");
        nCuenta = ent.nextLine();
        for (Cuenta cuen1 : cuen) {
            if ((cuen1.getNumCuenta()).equals(nCuenta)) {
                System.out.println("Monto a retirar: \t");
                monto = ent.nextDouble();
                cuen1.retirar(monto);
                retirar = true;
            }
        }
        if(retirar == false){
                System.out.println("Esta cuenta no existe");
        }
    }
    public static void consignarDin(Cuenta cuen[]){
        Scanner ent = new Scanner(System.in);
        String nCuenta;
        boolean consignar = false;    
        double monto;
        System.out.println("Numero de cuenta de la que va consignar: \t");
        nCuenta = ent.nextLine();
        for (Cuenta cuen1 : cuen) {
            if ((cuen1.getNumCuenta()).equals(nCuenta)) {
                System.out.println("Monto a consignar: \t");
                monto = ent.nextDouble();
                cuen1.consignar(monto);
                consignar = true;
            }
        }
        if(consignar == false){
                System.out.println("Esta cuenta no existe");
        }
    }
    public static void transferirDin(Cuenta cuen[]){
        Scanner ent = new Scanner(System.in);
        String nCuenta1,nCuenta2;
        boolean consignar = false;    
        double monto;
        System.out.println("Numero de cuenta origen: \t");
        nCuenta1 = ent.nextLine();
        for(int i=0;i<cuen.length;i++){
            if(cuen[i].getNumCuenta()==nCuenta1){
                System.out.println("Numero de cuenta destino: \t");
                nCuenta2 = ent.nextLine();
                for(int j=0;j<cuen.length;j++){
                    if(cuen[j].getNumCuenta()==nCuenta2){
                        
                    }
                }
             
            }
        }
        
        System.out.println("Monto a consignar: \t");
        monto = ent.nextDouble();
        if()
        
    }*/
    public static void consultar(Cuenta cuen[]){
        Scanner ent = new Scanner(System.in);
        String nCuenta;
        boolean consultar = false;    
        
        System.out.println("Numero de cuenta a consultar: \t");
        nCuenta = ent.nextLine();
        for (Cuenta cuen1 : cuen) {
            if ((cuen1.getNumCuenta()).equals(nCuenta)) {
                System.out.println("\n.::INFORME DE CUENTA::.");
                System.out.println("N°: "+cuen1.getNumCuenta());
                System.out.println("Saldo: "+cuen1.getSaldo());
                consultar = true;
            }
        }
        if(consultar == false){
                System.out.println("Esta cuenta no existe");
        }
    }
}
            
    
