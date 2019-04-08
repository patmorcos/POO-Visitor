package fr.p10.miage.m1a.visiteur.commande.interfaces;

import fr.p10.miage.m1a.visiteur.commande.model.*;

public interface IVisitor {

    void visit(Client c);
    void visit(Commande o);
    void visit(Ligne l);

    void afficherCommandes();

}
