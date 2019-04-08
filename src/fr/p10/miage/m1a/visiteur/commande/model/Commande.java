package fr.p10.miage.m1a.visiteur.commande.model;

import fr.p10.miage.m1a.visiteur.commande.interfaces.IVisitable;
import fr.p10.miage.m1a.visiteur.commande.interfaces.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class Commande implements IVisitable {

    private String name;
    private List<Ligne> ligneList = new ArrayList<Ligne>();

    @Override
    public void accept(IVisitor visitor) {
        ligneList.forEach(ligne -> ligne.accept(visitor));
        visitor.visit(this);
    }

    public List<Ligne> getLigneList() {
        return ligneList;
    }

    public Commande(String name) {
        //Coeurs
        this.name = name;
    }

    public Commande(String name, List<Ligne> ligneList) {
        this.name = name;
        this.ligneList = ligneList;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "name='" + name + '\'' +
                ", ligneList=" + ligneList +
                '}';
    }

    public void addLigne(Ligne l){
        ligneList.add(l);
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
