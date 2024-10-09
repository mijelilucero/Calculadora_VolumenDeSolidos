package umg.progra2;

import umg.progra2.metodos.Arandelas;
import umg.progra2.metodos.Cascarones;
import umg.progra2.metodos.Discos;

public class Main {
    public static void main(String[] args) {

        Discos discos = new Discos();
        discos.funcionamiento();

        Arandelas arandelas = new Arandelas();
        arandelas.funcionamiento();

        Cascarones cascarones = new Cascarones();
        cascarones.funcionamiento();

    }
}