package manejodearchivos;
//Cree un programa para control de venta de pan
//(panadería "el titanic se unde") donde maneje archivos.
//Henry Tercero 2890-20-1040
import java.util.Scanner;
import manejodearchivos.AministrarVentas;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//instanciamos scanner para leer datos del usuario
      //Instanciamos la clase y usamos el metodo para crear un archivo.txt
        AministrarVentas gestorVentas = new AministrarVentas("registro_ventas.txt");
//menu para bienvenida, usamo el ciclo while que saldra si el usuario ingresa 3 sale del bucle
        while (true) {
            System.out.println("\nBienvenido a la Panadería 'El Titanic se unde'");
            System.out.println("1. Registrar una venta");
            System.out.println("2. Mostrar registro de ventas");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();//segun opcion ingresada
            scanner.nextLine(); 
// switch para operar cada opcion
            switch (opcion) {
                case 1://se registra una venta y se guarda usando el constructor
                    System.out.print("Ingrese el nombre del producto: ");
                    String producto = scanner.nextLine();
                    System.out.print("Ingrese la cantidad vendida: ");
                    int cantidad = scanner.nextInt();
                    System.out.print("Ingrese el precio unitario del producto: ");
                    double precioUnitario = scanner.nextDouble();
                    gestorVentas.registrarVenta(producto, cantidad, precioUnitario);
                    break;
                case 2:
                    //solicitamos los datos ingresados
                    gestorVentas.mostrarRegistrosVentas();
                    break;
                case 3://salir
                    System.out.println("¡gracias por preferirnos!");
                    System.exit(0);
                default://captura cualquier numero fuera del rango y envia el siguiente mensaje
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
