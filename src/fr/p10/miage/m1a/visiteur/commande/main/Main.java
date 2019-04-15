package fr.p10.miage.m1a.visiteur.commande.main;

import fr.p10.miage.m1a.visiteur.commande.interfaces.IVisitor;
import fr.p10.miage.m1a.visiteur.commande.model.*;

public class Main {

    public static void main(String[] args) {

        Client c = new Client("Pat");
        Client c1 = new Client("Sousou");

        Ligne l1 = new Ligne("Ligne 1");
        Ligne l2 = new Ligne("Ligne 2");
        Ligne l3 = new Ligne("Ligne 3");

        Commande comm = new Commande("Commande n°1");
        Commande comm1 = new Commande("Commande n°2");
        Commande comm2 = new Commande("Commande n°3");
        comm.addLigne(l1);
        comm.addLigne(l2);
        comm.addLigne(l3);

        comm1.addLigne(l1);
        comm1.addLigne(l2);
        comm1.addLigne(l3);

        comm2.addLigne(l1);
        comm2.addLigne(l2);
        comm2.addLigne(l3);

        c1.addCommande(comm1);
        c.addCommande(comm);
        c.addCommande(comm2);

        GroupeClient g1 = new GroupeClient("Groupe 1");

        g1.addClient(c);
        g1.addClient(c1);

        IVisitor r1 = new RapportCommandes();

        g1.accept(r1);

        r1.afficherCommandes();
    }
}
