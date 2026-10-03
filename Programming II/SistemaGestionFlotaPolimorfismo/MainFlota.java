public class MainFlota {
    public static void main(String[] args) {
        Vehiculo[] flota = new Vehiculo[3];

        flota[0] = new Camion("AB234CD", "Iveco", 100.0, 8.0);
        flota[1] = new Furgoneta("AD567EF", "Renault", 100.0, true);
        flota[2] = new MotoEnvios("AG890HI", "Yamaha", 200.0);

        double distanciaKm = 150.0;
        double costoTotal = 0;

        System.out.println("=== Reporte de Operaciones de Flota ===");
        for (Vehiculo v : flota) {
            v.mostrarFicha();
            double costoViaje = v.calcularCostoViaje(distanciaKm);
            System.out.println("Costo de viaje (" + distanciaKm + " km): $" + costoViaje);
            System.out.println("--------------------------------------------------");
            costoTotal += costoViaje;
        }

        System.out.println("Costo total operativo de la flota: $" + costoTotal);
    }
}
