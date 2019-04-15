package fr.p10.miage.m1a.visiteur.commande.model;

import fr.p10.miage.m1a.visiteur.commande.interfaces.IVisitable;
import fr.p10.miage.m1a.visiteur.commande.interfaces.IVisitor;

public class Ligne implements IVisitable {

    private String name;

    @Override
    public String toString() {
        return "Ligne{" +
                "name='" + name + '\'' +
                '}';
    }

    public Ligne(String name) {
        this.name = name;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
