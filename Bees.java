/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bees;

/**
 *
 * @author cmorenoruiz
 */
public class Bees {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Voy a crear tres abejas y a mostrarlas por pantalla
        Abeja abeja1, abeja2;
        //abeja1 = new Obrera();
        abeja2 = new Zangano();
        Abeja abeja3 = new Reina();
        abeja2.muestra();
        abeja3.muestra();

    }

}
