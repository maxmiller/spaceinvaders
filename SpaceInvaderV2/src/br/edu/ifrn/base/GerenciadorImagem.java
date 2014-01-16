/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.base;


import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.net.URL;
import javax.imageio.IIOException;
import javax.imageio.ImageIO;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Transparency;
/**
 *
 * @author maxmiller
 */
public class GerenciadorImagem {
    
    private HashMap vetorImagem;
    private static GerenciadorImagem gerenciador=null;
    
    private GerenciadorImagem(){
        vetorImagem = new HashMap();
    }
    
    public static GerenciadorImagem get(){
        if(gerenciador == null){
            gerenciador = new GerenciadorImagem();
        }
        return gerenciador;
    }
    
    public Imagem getImagem(String ref){
        
        if(vetorImagem.get(ref)!=null){
            return (Imagem)vetorImagem.get(ref);
        }
        BufferedImage srcImage=null;
        try{
           URL url = this.getClass().getResource(ref);
           if(url == null){
               throw new Exception("Erro na imagem.");
           }
           srcImage = ImageIO.read(url);
        }catch(IIOException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        GraphicsConfiguration g = null;
        GraphicsEnvironment e=null;
        GraphicsDevice d = null;
        e = GraphicsEnvironment.getLocalGraphicsEnvironment();
        d = e.getDefaultScreenDevice();
        g = d.getDefaultConfiguration();
        int width = srcImage.getWidth();
        int heigth = srcImage.getHeight();
        Image image = null;
        image = g.createCompatibleImage(width, heigth,Transparency.BITMASK);
        
        return null;
        
        
    }
    
}
