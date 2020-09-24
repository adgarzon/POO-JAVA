
package CuentasCliente;

/**
 *
 * @author User
 */
public class Cuenta {
    private String numCuenta;
    private double saldo;

    public Cuenta(String numCuenta, double saldo) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    public boolean retirar(double m){
        if(this.saldo >= m && m>0){
            this.saldo -= m;
            return true;        
        }else{
            return false;
        }
    }
    public boolean consignar(double m){
        if(m>0){
            this.saldo+=m;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean transferir(double m, Cuenta a,Cuenta b){
        if(a.retirar(m)){
            return b.consignar(m);
        }
        else{
            return false;
        }
    }
}
