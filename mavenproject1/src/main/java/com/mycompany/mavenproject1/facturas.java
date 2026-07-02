/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author HP EliteBook
 */
public class facturas {
 private final String nombreCliente;
 private final double monto;
 private int mesNumero;
 private String mesTexto;
 private final int electricos;
 private final int automotrices;
 private final int construccion;
 
 
 public factura(String nombreCliente, double monto, int mesNumero,
                    int electricos, int automotrices, int construccion) {
        this.nombreCliente = nombreCliente;
        this.monto = monto;
        this.electricos = electricos;
        this.automotrices = automotrices;
        this.construccion = construccion;
        setMesNumero(mesNumero);  
   }

    private void setMesNumero(int mesNumero) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }public String getNombreCliente() {
    return nombreCliente;
    }public void setNombreCliente(String nombreCliente) {
    this.nombreCliente = nombreCliente;}
    public double getMonto() {
        return monto;
    }public void setMonto(double monto) {
        this.monto = monto;
    }public int getMesNumero() {
        return mesNumero;
    }
 
}
