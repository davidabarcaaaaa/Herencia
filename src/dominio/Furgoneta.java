class Furgoneta extends Vehiculo {
    private double capacidadM3;

    public Furgoneta(String marca, String modelo, double precioBase, double capacidadM3) {
        super(marca, modelo, precioBase);
        this.capacidadM3 = capacidadM3;
    }

    @Override
    public double calcularPrecioFinal() {
        double factorDescuento = 0.5;
        double precioFinal = getPrecioBase() * Math.pow(capacidadM3, 1.0 / 3) * factorDescuento;
        return precioFinal;
    }
}
