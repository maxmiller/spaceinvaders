/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.base;

import br.edu.ifrn.base.IEntidade;
import java.awt.Graphics;
/**
 *
 * @author maxmiller
 */
public class Entidade implements IEntidade{
    
    private double x;// Posição X
    private double y;// Posição Y
    private double vx;// Velocidade Eixo X
    private double vy;// Velocidade Eixo Y
    
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
    public Graphics desenho(){
        return null;
    }
    
    @Override
    public void movimento(){
        
    }
    
    @Override
    public boolean colisao(){
        return false;
    }
    
    @Override 
    public boolean colidido(){
        return false;
    }

    
}
