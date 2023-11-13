public class VehiculoTurismo {
    private String marca;
    private String modelo;
    private double precioBase;
    private int numeroPlazas;

    public VehiculoTurismo(String marca, String modelo, double precioBase, int numeroPlazas) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
        this.numeroPlazas = numeroPlazas;
	
	}
   
    public double calcularPrecioFinal() {
        if (numeroPlazas <= 5) {
            return precioBase;
        } else {
            int plazasExtra = numeroPlazas - 5;
            double aumentoPorPlaza = 0.10; // 10%
            double precioFinal = precioBase + (plazasExtra * aumentoPorPlaza * precioBase);
            return precioFinal;
        }
    }
}
