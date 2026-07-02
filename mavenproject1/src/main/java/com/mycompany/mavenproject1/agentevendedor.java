/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author HP EliteBook
 */
public class agentevendedor {
    private String nombre;
    private String apellidos;
    private String codigo;
    private String sucursal;
    private boolean vehiculoPropio;
    private double totalVentas;
    private double totalComisiones;
    private int totalPuntos;
    private int cantidadFacturas;
 
    public AgenteVendedor(String nombre, String apellidos, String codigo, String sucursal, boolean vehiculoPropio) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.codigo = codigo;
        this.sucursal = sucursal;
        this.vehiculoPropio = vehiculoPropio;
        this.totalVentas = 0;
        this.totalComisiones = 0;
        this.totalPuntos = 0;
        this.cantidadFacturas = 0;
    }public String getNombre() {
        return nombre;
    }public void setNombre(String nombre) {
        this.nombre = nombre;
    }public String getApellidos() {
        return apellidos;
    }public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }public String getCodigo() {
        return codigo;
    }public void setCodigo(String codigo) {
        this.codigo = codigo;
    }public String getSucursal() {
        return sucursal;
    }public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }public boolean VehiculoPropio() {
        return vehiculoPropio;
    }public void VehiculoPropio(boolean vehiculoPropio) {
        this.vehiculoPropio = vehiculoPropio;
    }public double getTotalVentas() {
        return totalVentas;
    }public double getTotalComisiones() {
        return totalComisiones;
    }public int getTotalPuntos() {
        return totalPuntos;
    }public int getCantidadFacturas() {
        return cantidadFacturas; 
    }   
    public void ventasuma(double monto) {
        totalVentas = totalVentas + monto;
        cantidadFacturas = cantidadFacturas + 1;
    }public void sumarComision(double monto) {
        totalComisiones = totalComisiones + monto;
    }public void sumarPuntos(int puntos) {
        totalPuntos = totalPuntos + puntos;
    }

}
