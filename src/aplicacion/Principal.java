public class Main {
    public static void main(String[] args) {
        Concesionario concesionario = new Concesionario();

        // Crear instancias de VehiculoTurismo y Furgoneta y agregarlas al catálogo
        VehiculoTurismo turismo1 = new VehiculoTurismo("MarcaTurismo", "ModeloTurismo", 10000, 5);
        Furgoneta furgoneta1 = new Furgoneta("MarcaFurgoneta", "ModeloFurgoneta", 20000, 8);

        concesionario.agregarVehiculo(turismo1);
        concesionario.agregarVehiculo(furgoneta1);

        // Mostrar el catálogo y el precio total
        concesionario.mostrarCatalogo();
        System.out.println("Precio total del catálogo: " + concesionario.obtenerPrecioTotal());
    }
}
