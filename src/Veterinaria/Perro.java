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
public class Perro extends Mascota{
    private String raza;

    public Perro(String raza, String id, String nombre, String colorPelo) {
        super(id, nombre, colorPelo);
        this.raza= raza;
    }
    public void sonido(){
        System.out.println("Guau");
    }
}
