/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author filor
 */
public class Grupo {
    private List<Ficha> ficha;

    public Grupo() {
    }

    public Grupo(List<Ficha> ficha) {
        this.ficha = ficha;
    }
    
    

    public List<Ficha> getFicha() {
        return ficha;
    }

    public void setFicha(List<Ficha> ficha) {
        this.ficha = ficha;
    }

    
    
}
