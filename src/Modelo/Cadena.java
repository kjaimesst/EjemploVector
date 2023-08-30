/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Oriana
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
        if (s2 != null && s2.cadena != null) {
            char nuevaCadena[] = new char[this.cadena.length + s2.cadena.length];

            // Copiar caracteres de la cadena actual a la nueva cadena
            for (int i = 0; i < this.cadena.length; i++) {
                nuevaCadena[i] = this.cadena[i];
            }

            // Copiar caracteres de s2 a la nueva cadena
            for (int i = 0; i < s2.cadena.length; i++) {
                nuevaCadena[this.cadena.length + i] = s2.cadena[i];
            }

            // Actualizar la referencia de cadena para que apunte a la nueva cadena
            this.cadena = nuevaCadena;
        }

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
