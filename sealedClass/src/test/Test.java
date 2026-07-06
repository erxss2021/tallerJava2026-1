package test;

import sealed.Automovil;
import sealed.Camion;
import sealed.Deportiva;
import sealed.Motocicleta;
import sealed.Vehiculo;
import subclases.CamionVolteo;

public class Test {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.conducir();
        Automovil automovil = new Automovil();
        automovil.conducir();
        Motocicleta motocicleta = new Motocicleta();
        motocicleta.conducir();
        Deportiva deportiva = new Deportiva();
        deportiva.conducir();
        Camion camion = new Camion();
        camion.conducir();
        CamionVolteo camionVolteo = new CamionVolteo();
        camionVolteo.conducir();
    }

}
