/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccion10;

/**
 *
 * @author LAB-USR-AQ265-A0302
 */
public class Nodo {
    
    

    public Nodo(String nom,Nodo siguiente) {
        this.siguiente = siguiente;
        this.nom = nom;
    }

    
    
    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Nodo{" + "siguiente=" + siguiente + ", nom=" + nom + '}';
    }
    
    private Nodo siguiente;
    private String nom;
}
