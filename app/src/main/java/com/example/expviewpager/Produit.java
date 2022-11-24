package com.example.expviewpager;

import java.util.ArrayList;
import java.util.List;

public class Produit {
    String nom;

    public Produit(String nom, float prix, int photo) {
        this.nom = nom;
        this.prix = prix;
        this.photo = photo;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    float prix;
    int photo;
    public static ArrayList<Produit> lstPro ()
    {
         ArrayList<Produit> lst = new ArrayList<Produit>();
               lst.add(new Produit("Stylo", 10f, R.drawable.ic_stylo));
               lst.add( new Produit("Carnet", 20f, R.drawable.ic_carnet));
               lst.add( new Produit("Feuilles blanches", 30f, R.drawable.ic_feuille));
               lst.add( new Produit("Crayon", 40f, R.drawable.ic_crayon));

        return lst;

    }
}
