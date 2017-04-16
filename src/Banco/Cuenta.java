/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.util.ArrayList;

/**
 *
 * @author JHOJAN
 */
public class Cuenta {
    private int i;
    private int numeroCuenta;
    private double saldoActual;
    private String fechaCreacion;
    private String nombreCliente;
    private ArrayList<Movimiento> movimiento;

    public Cuenta(int numeroCuenta, double saldoActual, String fechaCreacion, String nombreCliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldoActual = saldoActual;
        this.fechaCreacion = fechaCreacion;
        this.nombreCliente = nombreCliente;
        this.movimiento = new ArrayList<Movimiento>();
    }
    
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public ArrayList<Movimiento> getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(ArrayList<Movimiento> movimiento) {
        this.movimiento = movimiento;
    } 
    
    public void addMovimiento(Movimiento movimiento){
        this.movimiento.add(movimiento);
    }
    
    public void deposito(){
        saldoActual = (movimiento.get(i).getSaldoAnterior()+ movimiento.get(i).getCantidad());
    }
    public void retiro(){
        saldoActual = (movimiento.get(i).getSaldoAnterior()- movimiento.get(i).getCantidad());
    }
}
