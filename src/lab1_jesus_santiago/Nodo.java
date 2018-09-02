
package lab1_jesus_santiago;

/**
 *
 * @author Jesus David
 */
public class Nodo {
    Nodo p;
    String dato;
    Nodo izquierdo;
    Nodo derecho;

    public Nodo(Nodo padre,String dato) {
        this.dato = dato;
        this.p=padre;
        this.izquierdo = null;
        this.derecho = null;
    }

    public String getDato() {
        return dato;
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
    
}
