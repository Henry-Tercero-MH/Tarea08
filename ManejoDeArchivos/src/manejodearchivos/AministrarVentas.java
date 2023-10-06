
package manejodearchivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AministrarVentas {
  private List<Ventas> ventas;
    private String archivoVentas;
    
        public AministrarVentas(String archivoVentas) {
        this.archivoVentas = archivoVentas;
        ventas = new ArrayList<>();
      cargarVentasDesdeArchivo();
    }
      
        public void registrarVenta(String producto, int cantidad,double precioUnitario){
           Ventas venta = new Ventas(producto, cantidad, precioUnitario);
           ventas.add(venta);
        guardarVentasEnArchivo();  
            System.out.println("Venta Registrada: "+venta);
        }
        
        public void mostrarRegistrosVentas(){
            System.out.println("\nRegistro de Ventas:");
            for(Ventas venta: ventas){
                System.out.println(venta);
            }
        }
        
        private void cargarVentasDesdeArchivo() {
        try (BufferedReader br = new BufferedReader(new FileReader(archivoVentas))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                String producto = partes[0].trim();
                int cantidad = Integer.parseInt(partes[1].trim());
                double precioUnitario = Double.parseDouble(partes[2].trim());
                ventas.add(new Ventas(producto, cantidad, precioUnitario));
            }
        } catch (IOException e) {
            // El archivo no existe o no se puede leer (se creará uno nuevo al guardar ventas).
        }
    }
     
        private void guardarVentasEnArchivo() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoVentas))) {
            for (Ventas venta : ventas) {
                bw.write(venta.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   
    
}
