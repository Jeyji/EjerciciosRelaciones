/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Veterinaria;

import java.util.ArrayList;

/**
 *
 * @author JHOJAN
 */
public class Persona {
    private String name;
    private int id;
    private ArrayList<Mascota>mascota;

    public Persona(String name, int id, ArrayList<Mascota> mascota) {
        this.name = name;
        this.id = id;
        this.mascota = mascota;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Mascota> getMascota() {
        return mascota;
    }

    public void setMascota(ArrayList<Mascota> mascota) {
        this.mascota = mascota;
    }
    
    public void addMasoota(Mascota mascota){
        this.mascota.add(mascota);
    }
    public void verMascotas(){
        for(int i = 0; i < this.mascota.size(); i++){
            System.out.println("Nombre de la Mascota: "+mascota.get(i).getNombre());
            System.out.println("Numero de identificación: "+mascota.get(i).getId());
            System.out.println("Color del Pelo: "+mascota.get(i).getColorPelo());
            mascota.get(i).sonido();
            mascota.get(i).mostrarInfo();
        }
    }
}
