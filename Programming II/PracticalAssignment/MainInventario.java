public class MainInventario {
    public static void main(String[] args) {
        Producto productoUno = new Producto();
        productoUno.nombre = "Teclado";
        productoUno.codigo = "TEC-001";
        productoUno.precio = 25000.0;
        productoUno.stock = 20;

        Producto productoDos = new Producto();
        productoDos.nombre = "Mouse";
        productoDos.codigo = "MOU-002";
        productoDos.precio = 12000.0;
        productoDos.stock = 35;

        Producto productoTres = new Producto();
        productoTres.nombre = "Monitor";
        productoTres.codigo = "MON-003";
        productoTres.precio = 180000.0;
        productoTres.stock = 8;

        productoUno.mostrarFicha();
        productoUno.venderUnidades(5);
        productoUno.venderUnidades(0);
        productoUno.venderUnidades(100);
        productoUno.reponerStock(10);
        productoUno.reponerStock(-2);
        productoUno.actualizarPrecio(27500.0);

        productoDos.venderUnidades(3);
        productoTres.reponerStock(4);

        System.out.println("\nStock de los productos independientes:");
        System.out.println(productoUno.nombre + ": " + productoUno.stock);
        System.out.println(productoDos.nombre + ": " + productoDos.stock);
        System.out.println(productoTres.nombre + ": " + productoTres.stock);

        Producto copia = productoUno;
        copia.stock = 29;

        System.out.println("\nStock de copia: " + copia.stock);
        System.out.println("Stock de productoUno luego de modificar copia: " + productoUno.stock);
    }
}
