package dam.practicas.Apps;

public class Cartera {

    private String titular = "Ada Lovelace";
    private double saldo = 100.0;

    private void ingresar(double cantidad){
        if(cantidad >= 1){
            saldo = saldo + cantidad;

        }
    }
    private void retirar(double cantidad){
        if(cantidad >=1 && cantidad <= saldo){
            saldo = saldo - cantidad;

        }
    }
    private double consultarSaldo(){
        return this.saldo;
    }





}


