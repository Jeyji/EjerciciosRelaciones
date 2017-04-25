/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Veterinaria;

/**
 *
 * @author JHOJAN
 */
public class Hamster extends Mascota{
    private double peso;

    public Hamster(double peso, String id, String nombre, String colorPelo) {
        super(id, nombre, colorPelo);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void sonido(){
        System.out.println("Sniff");
    }
}
