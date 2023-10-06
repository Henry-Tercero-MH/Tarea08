
package manejodearchivos;

public class Ventas {
    //atributos
    private String producto;
    private int cantidad;
    private double precioUnitario;
//constructor sin parametros
    public Ventas() {
    }
//contructor con parametras
    public Ventas(String producto, int cantidad, double precioUnitario) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }
//metodos de acceso, ecapsulacion
    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
//metodo para mostrar datos
    @Override
    public String toString() {
        return "Ventas: \n" + "Producto: " + producto + " Cantidad: " + cantidad + " PrecioUnitario: " + precioUnitario;
    }
    
    
    
}
