/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Enumeracion.Dias;
import Enumeracion.Jugadores;
import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class Principal {

    public static void semanas() {
        Scanner teclado = new Scanner(System.in);
        String dias = "";
        Dias diasSemana = null;
        System.out.println("Dime el dia de la semana");
        dias = teclado.next().toLowerCase();
        switch (dias) {
            case "lunes":
                diasSemana = Dias.Lunes;
                System.out.println("El dia es " + diasSemana);
                break;
            case "martes":
                diasSemana = Dias.Martes;
                System.out.println("El dia es " + diasSemana);
                break;
            case "miercoles":
                diasSemana = Dias.Miercoles;
                System.out.println("El dia es " + diasSemana);
                break;
            case "jueves":
                diasSemana = Dias.Jueves;
                System.out.println("El dia es " + diasSemana);
                break;
            case "viernes":
                diasSemana = Dias.Viernes;
                System.out.println("El dia es " + diasSemana);
                break;
            case "sabado":
                diasSemana = Dias.Sabado;
                System.out.println("El dia es " + diasSemana);
                break;
            case "domingo":
                diasSemana = Dias.Domingo;
                System.out.println("El dia es " + diasSemana);
                break;
                default:
                    System.out.println("Ese dia no existe");
        }
    }

    public static void main(String[] args) {
       // semanas();
        System.out.println("El numero de goles de benzema es "  + Jugadores.Benzema.getGoles() + " y las tarjetas de Vinicius son " + Jugadores.Vinicius.getTarjetas());
    }
}
