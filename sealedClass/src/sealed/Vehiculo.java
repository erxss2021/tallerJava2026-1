package sealed;

public sealed class Vehiculo permits Automovil, Motocicleta, Camion {
    public void conducir(){
        System.out.println("En vehiculo");
    }
}
