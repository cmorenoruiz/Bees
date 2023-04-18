/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bees;

/**
 *
 * @author cmorenoruiz
 */
public class Reina extends Abeja {

    public Reina() {
        super(Abeja.Sexo.FEMENINO);
    }

    public Tipo getTipo() {
        return Abeja.Tipo.REINA;
    }
//La reina es la única hembra que puede ser fecundada1 por los zánganos ;
//pone huevos fecundados, que dan origen a abejas obreras
//y huevos sin fecundar que dan origen a zánganos
    
    public Huevo ponHuevo(Zangano zangano) {
        return new Huevo(Abeja.Sexo.FEMENINO);
    }

    public Huevo ponHuevo() {
        return new Huevo(Abeja.Sexo.MASCULINO);
    }

}
