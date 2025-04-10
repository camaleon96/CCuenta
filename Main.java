public class Main {

    public static void main(String[] args) {
        CCuenta miCuenta1;
        double saldoActual;
        
        miCuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = miCuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        CCuentaMetodo(miCuenta1);
    }

    public static void CCuentaMetodo(CCuenta miCuenta) {
        try {
            miCuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
    public static void operativa_cuenta(CCuenta miCuenta1, float cantidad){
       miCuenta1.depositar(500);
       miCuenta1.retirar(200);
       int saldo = miCuenta1.getsaldo();
       
       System.out.println("El dinero total en mi cuenta es: " + saldo);
    }
 }
