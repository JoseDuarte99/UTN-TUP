package GestionInventario;
public class Producto {
    public String nombre;
    public String codigo;
    public double precio;
    public int stock;

    public void venderUnidades(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: la cantidad a vender debe ser mayor a cero.");
            return;
        }
        if (cantidad > stock) {
            System.out.println("Error: stock insuficiente para vender " + cantidad + " unidades de " + nombre + ".");
            return;
        }

        stock -= cantidad;
        System.out.println("Venta exitosa: " + cantidad + " unidades de " + nombre + ". Stock restante: " + stock + ".");
    }

    public void reponerStock(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: la cantidad a reponer debe ser mayor a cero.");
            return;
        }

        stock += cantidad;
        System.out.println("Reposicion exitosa: " + cantidad + " unidades de " + nombre + ". Stock actual: " + stock + ".");
    }

    public void actualizarPrecio(double precio) {
        double precioAnterior = this.precio;
        this.precio = precio;
        System.out.println("Precio de " + nombre + " actualizado de $" + precioAnterior + " a $" + this.precio + ".");
    }

    public void mostrarFicha() {
        System.out.println("----- Ficha del producto -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Codigo: " + codigo);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
        System.out.println("------------------------------");
    }
}
