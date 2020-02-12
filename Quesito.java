/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author tss
 */
public class Quesito {

    protected final static Scanner scan = new Scanner(System.in);
    protected String domanda;
    protected String rispostacorretta;
    protected String rispostautente;
    protected int punteggio;
   

    public Quesito(String domanda, String rispostacorretta) {
        
        this.domanda = domanda;
        this.rispostacorretta = rispostacorretta;
    }

    public Quesito() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.rispostacorretta);
        hash = 97 * hash + this.punteggio;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Quesito other = (Quesito) obj;
        if (this.punteggio != other.punteggio) {
            return false;
        }
        if (!Objects.equals(this.rispostacorretta, other.rispostacorretta)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Quesito{" + "domanda=" + domanda + ", rispostacorretta=" + rispostacorretta + ", punteggio=" + punteggio + '}';
    }

    public int Ask(Quesito q) {

        System.out.println(domanda);
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci risposta");
        String rispostautente = scan.nextLine();

        if (rispostautente.equals(this.rispostacorretta)) {
            System.out.println("risposta esatta");
        } else if (!rispostautente.equals(this.rispostacorretta)) {
            System.out.println("risposta errata");
        }
        return punteggio;
    }

}
