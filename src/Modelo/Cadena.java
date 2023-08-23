/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Lab03pc05
 */
public class Cadena {

    private char cadena[];

    public Cadena() {
    }

    public Cadena(String datos) {
        this.cadena = datos.toCharArray();
    }

    public Cadena getCopia() {
        if (this.cadena != null) {
            char respuesta[] = new char[this.cadena.length];
            for (int i = 0; i < respuesta.length; i++) {
                respuesta[i] = this.cadena[i];

            }
            Cadena nueva = new Cadena();
            nueva.cadena = respuesta;
            return nueva;
        }
        return null;
    }

    //Punto a
    @Override
    public String toString() {
        String msg = "";
        for (char dato : this.cadena) {
            msg += dato + "-";
        }
        return msg;
    }

    //Punto b
    public void añadir(Cadena s2) {
        /**
         * :)
         */

    }

    //Punto d
    public int getContarPalabra() {
        return 0;
    }

    //Punto e:
    public String toString2() {
        String msg = "";
        for (char dato : this.cadena) {
            if (dato == ' ') {
                msg += dato + "\n";
            } else {
                msg += dato + "-";
            }
        }
        return msg;
    }

    //Punto f:
    public boolean isPalindrome() {
        return false;
    }

    //Punto g
    public boolean sonIguales(Cadena c2) {
        return false;
    }

    //Punto h
    public void convertirMay() {
        //:)
    }

    //Punto i
    public void convertirMin() {
        //:)
    }

    //Punto j
    public int getContarVeces(Cadena c2) {
        //:)
        return 0;
    }
}
