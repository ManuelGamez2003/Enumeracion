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
public enum Jugadores {
    Benzema(5,2),
    Vinicius(6,1),
    Rodrygo(4,1),
    Valverde(6,2),
    Asensio(7,1);
    
    private final int goles;
     private final int tarjetas;

    private Jugadores(int goles, int tarjetas) {
        this.goles = goles;
        this.tarjetas = tarjetas;
    }

    public int getGoles() {
        return goles;
    }

    public int getTarjetas() {
        return tarjetas;
    }
    
}
