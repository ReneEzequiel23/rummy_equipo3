/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author filor
 */
public class FichaNumerica extends Ficha{
    private int numero;
    private String color;

    public FichaNumerica() {
    }

    public FichaNumerica(int numero, String color) {
        this.numero = numero;
        this.color = color;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
