/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bees;

/**
 *
 * @author cmorenoruiz
 */
public class Huevo {

    Abeja.Sexo sexo;
    Integer jaleaIngerida = 0;
    Integer alimentoIngerido = 0;

    public Huevo(Abeja.Sexo sexo) {
        this.sexo = sexo;
    }

    public Abeja.Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Abeja.Sexo sexo) {
        this.sexo = sexo;
    }

    public Integer getJaleaIngerida() {
        return jaleaIngerida;
    }

    public void setJaleaIngerida(Integer jaleaIngerida) {
        this.jaleaIngerida = jaleaIngerida;
    }

    public Integer getAlimentoIngerido() {
        return alimentoIngerido;
    }

    public void setAlimentoIngerido(Integer alimentoIngerido) {
        this.alimentoIngerido = alimentoIngerido;
    }

    public void sumaJaleaIngerida(Integer moreJalea){
        setJaleaIngerida(getJaleaIngerida()+moreJalea);
    }
    public void muestra() {
        System.out.println("Soy un huevo de sexo " + getSexo()+ " y he comido jalea: " +getJaleaIngerida());
    }
    

}
