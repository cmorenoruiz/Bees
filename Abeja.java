/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bees;

/**
 *
 * @author cmorenoruiz
 */
public abstract class Abeja {

    protected enum Sexo {
        FEMENINO, MASCULINO
    };

    protected enum Tipo {
        OBRERA, ZANGANO, REINA
    };

    private Sexo sexo;

    public Abeja(Sexo sexo) {
        this.sexo = sexo;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public abstract Tipo getTipo();

    void muestra() {
        System.out.println("Abeja de sexo " + getSexo() + " y de tipo " + getTipo());
    }

    public void vuela() {
        System.out.println("Soy una abeja volando...");
    }

}
