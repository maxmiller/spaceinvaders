/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.base;

import java.awt.Graphics;
/**
 *
 * @author maxmiller
 */
public interface IEntidade {
    
    void desenhar();
    void movimentar();
    boolean colidir(Entidade outra);
    void colidiu(Entidade outra);
}
