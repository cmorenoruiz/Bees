/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bees;

/**
 *
 * @author cristina
 */
public class Obrera extends Abeja {
    //El constructor de la Obrera no necesita recibir el sexo,
    //porque siempre serán de sexo femenino
    public Obrera() {
        super(Abeja.Sexo.FEMENINO);
    }

    @Override
    public Tipo getTipo() {
        return Abeja.Tipo.OBRERA;
    }
    
    //Solo ponen huevos que serán zánganos
    public Huevo ponHuevo() {
        return new Huevo(Abeja.Sexo.MASCULINO);
    }
    
    public void segregaCera() {
        System.out.println("Estoy generando cera");
    }    
}