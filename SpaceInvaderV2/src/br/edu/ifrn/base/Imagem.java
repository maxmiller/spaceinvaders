/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.base;

import java.awt.Image;
import java.awt.Graphics;
/**
 *
 * @author maxmiller
 */
public class Imagem {
    
    private Image im;
    
    public Imagem(Image im){
        this.im = im;
    }
    
    public Image getIm(){
        return im;
    }
    
    public void setIm(Image im){
        this.im = im;
    }
    
    public int getLargura(){
        return im.getWidth(null);
    }
    
    public int getAltura(){
        return im.getHeight(null);
    }
    
    public boolean renderizar(Graphics g, int x, int y){
        return g.drawImage(im, x, y, null);
        
    }
}
