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
public class Gato extends Mascota{
    private double cazador;

    public Gato(double cazador, String id, String nombre, String colorPelo) {
        super(id, nombre, colorPelo);
        this.cazador = cazador;
    }
    public void sonido(){
        System.out.println("Miau");
    }

    public double getCazador() {
        return cazador;
    }

    public void setCazador(double cazador) {
        this.cazador = cazador;
    }

    
    @Override
    public String mostrarInfo() {
        return this.cazador + "" ;
    }
}
