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
public class Triangulo {
    private float base;
    private float altura;
    private float a;
    private float b;
    private float c;

    public Triangulo() {
    }

    public Triangulo(float base, float altura, float a, float b, float c) {
        this.base = base;
        this.altura = altura;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * @return the base
     */
    public float getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * @return the a
     */
    public float getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public float getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public float getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(float c) {
        this.c = c;
    }
    
    public float perimetro(float a, float b, float c){
        return a+b+c;
    }
    
    public float area(float base, float altura){
        return (base*altura)/2;
    }
    
    public void ingresoArea(){
        base=Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la base del triangulo"));
        altura=Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la altura del triangulo"));
        JOptionPane.showMessageDialog(null, "El Área del triángulo es: "+area(base, altura));
    }
    
    public void ingresoPerimetro(){
        a=Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el primer lado del triángulo"));
        b=Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el segundo lado del triángulo"));
        c=Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el tercer lado del triángulo"));
        JOptionPane.showMessageDialog(null, "El Perímetro del triángulo es: "+perimetro(a, b, c));
    }
}
