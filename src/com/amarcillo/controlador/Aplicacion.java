/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amarcillo.controlador;

import com.amarcillo.vista.Circulo;
import com.amarcillo.vista.Triangulo;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class Aplicacion {
    public static void main(String[] args) {
        Triangulo tri = new Triangulo();
        Circulo cir = new Circulo();
        tri.ingresoArea();
        tri.ingresoPerimetro();
        cir.ingresoCircunferencia();
        cir.ingresoArea();
    }
}
