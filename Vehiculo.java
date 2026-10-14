
package com.mycompany.practica01;


public class Vehiculo {

    String marca;
    private double cantidadCombustible;

    public Vehiculo(String marca, double cantidadCombustible) {
        this.marca = marca;
        this.cantidadCombustible = cantidadCombustible;
    }

    public double getcombustible() {
        return this.cantidadCombustible;
    }

    double recargarCombusitble(double cantidad) {
        this.cantidadCombustible += cantidad;

        return this.cantidadCombustible;
    }

    String mostrarFicha() {
        return "La marca es " + this.marca + " y tiene de combustible " + this.cantidadCombustible;
    }

}