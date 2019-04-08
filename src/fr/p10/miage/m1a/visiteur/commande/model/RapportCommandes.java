package fr.p10.miage.m1a.visiteur.commande.model;

import fr.p10.miage.m1a.visiteur.commande.interfaces.IVisitor;

import java.util.List;

public class RapportCommandes implements IVisitor {

    private List<>

    @Override
    public void visit(Ligne l) {

        System.out.println("Rapport de commandes (ligne) : " + l.toString());
    }

    @Override
    public void visit(Client c) {
        System.out.println("Rapport de commandes (client) : " + c.toString());
    }

    @Override
    public void visit(Commande o) {
        System.out.println("Rapport de commandes (commande) : " + o.toString());
    }

    @Override
    public void afficherCommandes() {
        System.out.println("RAPPORT COMMANDES :");

    }
}
