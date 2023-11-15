
import java.util.ArrayList;
import java.util.List;

abstract class Vehiculo {
    private String marca;
    private String modelo;
    private double precioBase;

    public Vehiculo(String marca, String modelo, double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
    }

    public abstract double calcularPrecioFinal();

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecioBase() {
        return precioBase;
    }
}

