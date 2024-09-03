package miPrincipal;

public class Cuenta_Cheques {
   private String nombreCuenta;
   private String nombreCliente;
   private String sucursal;
   private float saldo;

   // Constructor por defecto
   public Cuenta_Cheques() {
       this.nombreCuenta = "";
       this.nombreCliente = "";
       this.sucursal = "";
       this.saldo = 0.0f;
   }

   // Constructor con parámetros
   public Cuenta_Cheques(String nombreCuenta, String nombreCliente, String sucursal) {
       this.nombreCuenta = nombreCuenta;
       this.nombreCliente = nombreCliente;
       this.sucursal = sucursal;
       this.saldo = 0.0f;
   }

   // Método para depositar dinero
   public float deposito(float cantidad) {
       if (cantidad > 0) {
           this.saldo += cantidad;
       }
       return this.saldo;
   }

   // Método para retirar dinero
   public float retiro(float cantidad) {
       if (cantidad > 0 && cantidad <= this.saldo) {
           this.saldo -= cantidad;
       }
       return this.saldo;
   }

   // Método para mostrar el saldo actual
   public float muestra_saldo() {
       return this.saldo;
   }

   public String getNombreCuenta() {
       return nombreCuenta;
   }

   public void setNombreCuenta(String nombreCuenta) {
       this.nombreCuenta = nombreCuenta;
   }

   public String getNombreCliente() {
       return nombreCliente;
   }

   public void setNombreCliente(String nombreCliente) {
       this.nombreCliente = nombreCliente;
   }

   public String getSucursal() {
       return sucursal;
   }

   public void setSucursal(String sucursal) {
       this.sucursal = sucursal;
   }
   
    
    
}
