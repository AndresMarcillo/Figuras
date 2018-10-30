/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amarcillo.vista;

import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class Circulo {
    double pi=3.14;
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double circunferencia(double radio){
        return 2*pi*radio;
    }
    
    public double area(double radio){
        return pi*radio*radio;
    }
    
    public void ingresoCircunferencia(){
        radio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio para calcular la circunferencia del círculo"));
        JOptionPane.showMessageDialog(null, "La Circunferencia del círculo es: "+circunferencia(radio));
    }
    
    public void ingresoArea(){
        radio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio para calcular el área del círculo"));
        JOptionPane.showMessageDialog(null, "El Área del círculo es: "+area(radio));
    }
}
