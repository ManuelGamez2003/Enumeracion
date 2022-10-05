/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumeracion;

/**
 *
 * @author Alumno Mañana
 */
public enum Continentes {
    
    AFRICA(53),
    EUROPA(46),
    AMERICA(44),
    ASIA(34),
    OCEANIA(14);
   
     private final int continente;
   // private enum constructor
    Continentes(int continente) {
      this.continente = continente;
   }

   public int getContinente() {
        return continente;
    }

   
    
}
