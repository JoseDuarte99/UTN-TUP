public class Libro {
    private final String titulo;
    private final String autor;
    private final String isbn;
    private int copiasDisponibles;
    private double precioReposicion;

    public Libro(String titulo, String autor, String isbn, int copiasDisponibles, double precioReposicion) {
        if (titulo == null || titulo.isBlank()) {
            System.out.println("Título inválido, se usó \"Sin título\" por defecto.");
            this.titulo = "Sin título";
        } else {
            this.titulo = titulo;
        }

        if (autor == null || autor.isBlank()) {
            System.out.println("Autor rechazado: no puede ser nulo ni estar en blanco. Se usará \"Autor desconocido\".");
            this.autor = "Autor desconocido";
        } else {
            this.autor = autor;
        }

        if (isbn == null || isbn.isBlank()) {
            System.out.println("ISBN rechazado: no puede ser nulo ni estar en blanco. Se usará \"ISBN pendiente\".");
            this.isbn = "ISBN pendiente";
        } else {
            this.isbn = isbn;
        }

        if (copiasDisponibles < 0) {
            System.out.println("Copias rechazadas: la cantidad no puede ser negativa. Se usarán 0 copias.");
            this.copiasDisponibles = 0;
        } else {
            this.copiasDisponibles = copiasDisponibles;
        }

        if (!precioValido(precioReposicion)) {
            System.out.println("Precio de reposición rechazado: debe ser mayor a 0. Se usará $15000.0.");
            this.precioReposicion = 15000.0;
        } else {
            this.precioReposicion = precioReposicion;
        }
    }

    public Libro(String titulo, String autor, String isbn) {
        this(titulo, autor, isbn, 1, 15000.0);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public double getPrecioReposicion() {
        return precioReposicion;
    }

    public boolean prestar() {
        if (copiasDisponibles > 0) {
            copiasDisponibles--;
            System.out.println("Préstamo registrado: \"" + titulo + "\". Copias disponibles: " + copiasDisponibles);
            return true;
        }

        System.out.println("Error: no hay copias disponibles de \"" + titulo + "\" para prestar.");
        return false;
    }

    public void devolver() {
        copiasDisponibles++;
        System.out.println("Devolución registrada: \"" + titulo + "\". Copias disponibles: " + copiasDisponibles);
    }

    public boolean setPrecioReposicion(double precio) {
        if (!precioValido(precio)) {
            return false;
        }

        precioReposicion = precio;
        return true;
    }

    public void mostrarFicha() {
        System.out.println("=== Ficha de libro ===");
        System.out.println("Título:  " + titulo);
        System.out.println("Autor:   " + autor);
        System.out.println("ISBN:    " + isbn);
        System.out.println("Copias disponibles: " + copiasDisponibles);
        System.out.println("Precio de reposición: $" + precioReposicion);
        System.out.println("=======================");
    }

    private static boolean precioValido(double precio) {
        return precio > 0;
    }
}
