package fr.p10.miage.m1a.visiteur.commande.model;

import fr.p10.miage.m1a.visiteur.commande.interfaces.IVisitable;
import fr.p10.miage.m1a.visiteur.commande.interfaces.IVisitor;

public class GroupeClient implements IVisitable {

    private String name;

    public void accept(IVisitor visitor){

    }

    public GroupeClient(String name) {
        this.name = name;
    }

    public void addClient(Client c){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
