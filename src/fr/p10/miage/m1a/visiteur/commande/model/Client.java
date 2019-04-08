package fr.p10.miage.m1a.visiteur.commande.model;

import fr.p10.miage.m1a.visiteur.commande.interfaces.IVisitable;
import fr.p10.miage.m1a.visiteur.commande.interfaces.IVisitor;

public class Client implements IVisitable {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    public void accept(IVisitor visitor){

    }

    public void addCommande(Commande c){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
