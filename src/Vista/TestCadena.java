/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Cadena;

/**
 *
 * @author Oriana
 */
public class TestCadena {

    public static void main(String[] args) {
        Cadena c1 = new Cadena("Madarme");
        Cadena c2 = c1.getCopia();
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        c1.añadir(c2);
        System.out.println("" + c1.toString());

    }
}
