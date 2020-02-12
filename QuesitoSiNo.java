/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.test;

/**
 *
 * @author tss
 */
public class QuesitoSiNo extends Quesito {
    
    
    protected String rispostaSiNo;
    protected static String RISPSI = "si";
    protected static String RISPNO = "no";


    public QuesitoSiNo(String domanda, String rispostacorretta) {
        super(domanda, rispostacorretta);
        this.rispostaSiNo = rispostaSiNo;
    }

    @Override
    public int Ask(Quesito q) {
        
        
        return super.Ask(q); 
    }
    
    
    

   
  

}


  