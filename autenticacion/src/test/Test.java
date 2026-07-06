package test;

import sealed.ExitoLogin;
import sealed.ResultadoLogin;

public class Test {
    public static void main(String[] args) {
        //ResultadoLogin --> ExitoLogin, CredencialesInvalidas, CuentaBloqueada
        ResultadoLogin login = new ExitoLogin();

    }
}
