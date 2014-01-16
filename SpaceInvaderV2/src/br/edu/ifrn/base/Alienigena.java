/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.base;

/**
 *
 * @author maxmiller
 */
public class Alienigena extends Entidade {
    
    private int velocidade;
    
    public Alienigena(){
        velocidade = 75;
        setVx(getVx() - velocidade);
    }
}
