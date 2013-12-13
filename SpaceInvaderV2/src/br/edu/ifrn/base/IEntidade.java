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
    
    Graphics desenho();
    void movimento();
    boolean colisao();
    boolean colidido();
}
