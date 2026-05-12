package dam.practicas.ejerciciosExcepciones.CuentaBancaria;

public class AppCuenta {
    public static void main(String[] args) {

        CuentaBancaria cb1 = new CuentaBancaria(1000);




        try{
            cb1.retirar(200);
            System.out.println("En la cuenta quedan " + cb1.saldo);
            cb1.retirar(-500);
            System.out.println(cb1.saldo);
            cb1.retirar(300);
            System.out.println("En la cuenta quedan " + cb1.saldo);

        } catch (IllegalArgumentException e){
            System.out.println("ERROR: " + e.getMessage());
        }



    }
}
 
