/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.base;

/**
 *
 * @author maxmiller
 */
public class Tiro extends Entidade{
    
    private int velocidade;
    
    public Tiro(){
        velocidade = 200;
        setVy(getVy()+velocidade);
    }
}
