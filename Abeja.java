/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bees;

/**
 *
 * @author cmorenoruiz
 */
public abstract class Abeja {

    protected enum Sexo {FEMENINO, MASCULINO};
    protected enum Tipo {OBRERA,ZANGANO,REINA};

    Sexo sexo;
    
    public Abeja(Sexo sexo) {
        this.sexo=sexo;
    }
    
    public void vuela(){
        System.out.println("Soy una abeja volando...");
    }
    
    public abstract Tipo getTipo();
    
    
}
