/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bees;

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
        abeja1 = new Obrera();
        abeja2 = new Zangano();
        Abeja abeja3 = new Reina();
        abeja1.muestra();
        abeja2.muestra();
        abeja3.muestra();
        //abeja1.segregaCera(); No sepuede pedirle a una Abeja este método
         Obrera obrera1 = (Obrera) abeja1;
         //Opero con la misma abeja, tratándola como Abeja o como Obrera
        obrera1.muestra();
        //abeja1.segregaCera();
        obrera1.segregaCera();
        //Probando a poner huevos
        Zangano zangano1= new Zangano();
        zangano1.muestra();
        Reina reina= new Reina();
        Huevo huevo1, huevo2;
        huevo1=reina.ponHuevo();
        huevo2=reina.ponHuevo(zangano1);
        huevo1.muestra();
        huevo2.muestra();
        
        Colmena blanca =new Colmena();
        blanca.muestra();
        blanca.guardaHuevo(huevo2);
        blanca.guardaHuevo(huevo1);
        blanca.muestra();
        

    }

}
