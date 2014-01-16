/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.base;

import br.edu.ifrn.base.IEntidade;
import java.awt.Graphics;
import java.awt.Rectangle;
/**
 *
 * @author maxmiller
 */
public class Entidade implements IEntidade{
    
    private double x;// Posição X
    private double y;// Posição Y
    private double vx;// Velocidade Eixo X
    private double vy;// Velocidade Eixo Y
    private Imagem imagem;
    private Rectangle r1;
    private Rectangle r2;
     
    //Get 
     public double getX(){
         return x;
     }
    // Set
    public void setX(double x){
        this.x = x;
    }
    
    
    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * @return the vx
     */
    public double getVx() {
        return vx;
    }

    /**
     * @param vx the vx to set
     */
    public void setVx(double vx) {
        this.vx = vx;
    }

    /**
     * @return the vy
     */
    public double getVy() {
        return vy;
    }

    /**
     * @param vy the vy to set
     */
    public void setVy(double vy) {
        this.vy = vy;
    }
    
    
    
    
    @Override
    public void desenhar(){
    }
    
    @Override
    public void movimentar(){
        
    }
    
    @Override
    public boolean colidir(Entidade outra){
        r1 = new Rectangle();
        r2 = new Rectangle();
        r1.setBounds((int)x, (int)y,
                imagem.getLargura(), 
                imagem.getAltura());
        r2.setBounds((int)outra.getX(),
             (int)outra.getY(),
             outra.getImagem().getLargura(),
             outra.getImagem().getAltura());
        return r1.intersects(r2);
    }
    
    @Override 
    public void colidiu(Entidade outra){
        
    }

    /**
     * @return the imagem
     */
    public Imagem getImagem() {
        return imagem;
    }

    /**
     * @param imagem the imagem to set
     */
    public void setImagem(Imagem imagem) {
        this.imagem = imagem;
    }

    
}
