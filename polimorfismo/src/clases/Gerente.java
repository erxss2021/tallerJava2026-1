package clases;

public class Gerente extends Empleado{

    @Override
    public void trabajar() {
        System.out.println("Administrando la empresa..");
    }

    public void aprobarVacaciones(){
        System.out.println("Aprobando vacaciones....");
    }

}
