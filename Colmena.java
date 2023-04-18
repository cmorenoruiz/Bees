/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bees;

import java.util.ArrayList; // import the ArrayList class
import java.util.Random;

/**
 *
 * @author cristina
 */
public class Colmena {

    private ArrayList<Abeja> enjambre;
    private Huevo[][] panal;

    public Colmena() {
        this.enjambre = new ArrayList<Abeja>();
        Random rand = new Random();
        //Me aseguro que como mínimo tenga tres filas
        int numFilas = rand.nextInt(8) + 3;
        int numColumnas = numFilas - 1;
        panal = new Huevo[numFilas][numColumnas];
    }

    public void muestra() {
        System.out.println("Soy una colmena.");
        if (enjambre.isEmpty()) {
            System.out.println("No tengo abejas");
        } else {
            System.out.println("Estas son mis abejas:");
            for (Abeja abeja : enjambre) {
                abeja.muestra();
            }
        }
        System.out.println("Este es el contenido de mi panal:");
        for (int i = 0; i < panal.length; ++i) {
            for (int j = 0; j < panal[i].length; ++j) {
                if (panal[i][j]!=null) {
                    panal[i][j].muestra();
                }
            }
        }

    }

    public boolean guardaHuevo(Huevo huevo) {
        if (!panalIsFull()) {
            for (int i = 0; i < panal.length; ++i) {
                for (int j = 0; j < panal[i].length; ++j) {
                    if (panal[i][j]==null) {
                        panal[i][j]=huevo;
                        return true;
                    }
                }
            }
        }return false;
    }
    
    public boolean eclosionaHuevo(Integer fila, Integer columna){
        if ((fila <0)||(columna<0)||(fila>panal.length)||(columna>panal[0].length)){
            return false;
        }
        //obtenemos una nueva abeja
        Abeja nuevaAbeja= panal[fila][columna].eclosionar();
        //la añadimos al enjambre
        enjambre.add(nuevaAbeja);
        //vaciamos la posición del panal
        panal[fila][columna]=null;
        return true;
    }

    public boolean panalIsFull() {
        for (int i = 0; i < panal.length; ++i) {
            for (int j = 0; j < panal[i].length; ++j) {
                if (panal[i][j]==null) {
                    return false;
                }
            }
        }
        return true;
    }

}
