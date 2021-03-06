
package lab1_jesus_santiago;

import java.awt.Rectangle;
import javax.swing.JPanel;

/**
 *
 * @author Jesus David
 */
public class Nodo {
    private Nodo p;
    private String dato;
    private Nodo izquierdo;
    private Nodo derecho;
    private int x,y,level,width,height;
    
    
    
    public Nodo(){
        this.dato="";
        this.setDerecho(null);
        this.setIzquierdo(null);
    }

    public Nodo(Nodo padre,String dato) {
        this.dato = dato;
        this.p=padre;
        this.izquierdo = null;
        this.derecho = null;
    }

    public int getWidth() {
        return width;
    }
    
    public void setWidth(int s){
        this.width=s;
    }
    
    public int getHeight() {
        return height;
    }
    
    public void setHeight(int s){
        this.height=s;
    }
    
    public void setDato(String s){
        this.dato=s;
    }
    
    public String getDato() {
        return dato;
    }
    
    public int getLevel() {
        return level;
    }
    
    public void setLevel(int s){
        this.level=s;
    }
    
    public Nodo getPadre(){
        return this.p;
    }
    public void setPadre(Nodo n){
        this.p=n;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }
    
    public int getX() {
        return x;
    }
    
    public void setX(int p){
        this.x=p;
    }
    
    public int getY() {
        return y;
    }
    
    public void setY(int p){
        this.y=p;
    }
    
}
