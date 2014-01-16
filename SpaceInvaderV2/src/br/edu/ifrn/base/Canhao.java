/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.base;

/**
 *
 * @author maxmiller
 */
public class Canhao extends Entidade{
    
    private int velocidade;
    
    public Canhao(){
        velocidade = 300;
        setVx(getVx() + velocidade);
    }
}
