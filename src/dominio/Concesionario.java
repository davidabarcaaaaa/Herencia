public class Main {
    public static void main(String[] args) {
        Concesionario concesionario = new Concesionario();

       
        VehiculoTurismo vehiculo1 = new VehiculoTurismo("Marca1", "Modelo1", 10000, 5);
        VehiculoTurismo vehiculo2 = new VehiculoTurismo("Marca2", "Modelo2", 10000, 7);

        concesionario.agregarVehiculo(vehiculo1);
        concesionario.agregarVehiculo(vehiculo2);

        
        concesionario.mostrarVehiculos();

     
        System.out.println("Precio total de los vehículos: " + concesionario.sumarPrecioTotal());
    }
}
