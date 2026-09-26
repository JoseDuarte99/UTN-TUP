public class MainBiblioteca {
    public static void main(String[] args) {
        // new Libro(); // No compila: al declarar constructores propios, desaparece el constructor sin argumentos automático.

        Libro libro1 = new Libro("", "Lucía Ferrer", "9789501234567");
        Libro libro2 = new Libro("Diseño de software práctico", "", "9789876543210", 3, 24500.0);
        Libro libro3 = new Libro("Algoritmos para todos", "Marina Quiroga", "", 2, 18900.0);

        boolean tituloPorDefecto = "Sin título".equals(libro1.getTitulo());
        System.out.println("¿Se aplicó el título por defecto? " + tituloPorDefecto);

        double precioAnterior = libro1.getPrecioReposicion();
        boolean precioAceptado = libro1.setPrecioReposicion(-100.0);
        System.out.println("¿Se pudo aplicar el precio -100.0? " + precioAceptado
                + " (sigue vigente $" + libro1.getPrecioReposicion() + ").");
        boolean precioConservado = precioAnterior == libro1.getPrecioReposicion();
        System.out.println("¿Se conservó el precio anterior? " + precioConservado);

        System.out.println();
        libro1.mostrarFicha();
        libro2.mostrarFicha();
        libro3.mostrarFicha();

        boolean primerPrestamo = libro1.prestar();
        System.out.println("Resultado del primer préstamo: " + primerPrestamo);
        boolean segundoPrestamo = libro1.prestar();
        System.out.println("Resultado del préstamo sin copias: " + segundoPrestamo);
        libro1.devolver();
        double precioNuevo = 17500.0;
        if (libro1.setPrecioReposicion(precioNuevo)) {
            System.out.println("Precio de reposición actualizado de \"" + libro1.getTitulo()
                    + "\": $" + precioAnterior + " -> $" + libro1.getPrecioReposicion());
        }
    }
}
