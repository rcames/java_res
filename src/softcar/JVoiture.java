/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softcar;

import java.awt.List;

/**
 *
 * @author toretto
 */
public class JVoiture {
    
    private String marque;
    private String carburant;
    private String typeVoiture;
    private double prix;

    
    
    public JVoiture(String marque,String carburant,String typeVoiture,double prix)
    {
        this.marque = marque;
        this.carburant= carburant;
        this.prix = prix;
        this.typeVoiture= typeVoiture;
    }
    
    public String getMarque() {
        return marque;
    }

    public String getCarburant() {
        return carburant;
    }

    public String getTypeVoiture() {
        return typeVoiture;
    }

    public double getPrix() {
        return prix;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public void setTypeVoiture(String typeVoiture) {
        this.typeVoiture = typeVoiture;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    
    
    
    
    
    
}
