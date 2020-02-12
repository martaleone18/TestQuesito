/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.test;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Quesito q = new Quesito();
        Quesito a = new Quesito("scoperta dell'america", "1492");
        Quesito b = new Quesito("la capitale della francia", "parigi");

        System.out.println(q.Ask(a));
        System.out.println(q.Ask(b));

    }

}
