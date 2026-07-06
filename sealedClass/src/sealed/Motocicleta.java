package sealed;

/**
 * Motocicleta
 */
public sealed class Motocicleta extends Vehiculo permits Deportiva{

    @Override
    public void conducir() {
        System.out.println("Conduciendo motocicleta.");
    }

}
