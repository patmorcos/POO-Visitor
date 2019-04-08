package fr.p10.miage.m1a.visiteur.commande.model;

import fr.p10.miage.m1a.visiteur.commande.interfaces.IVisitable;
import fr.p10.miage.m1a.visiteur.commande.interfaces.IVisitor;

import java.util.ArrayList;

public class Client implements IVisitable {

    private String name;
    private ArrayList<Commande> commandeList = new ArrayList<Commande>();

    public Client(String name) {

        this.name = name;
    }

    public void accept(IVisitor visitor){
        commandeList.forEach(commande -> commande.accept(visitor));
        visitor.visit(this);
    }

    public ArrayList<Commande> getCommandeList() {

        return commandeList;
    }

    public void addCommande(Commande c){
        commandeList.add(c);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", commandeList=" + commandeList +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
