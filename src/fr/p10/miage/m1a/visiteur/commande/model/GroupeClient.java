package fr.p10.miage.m1a.visiteur.commande.model;

import fr.p10.miage.m1a.visiteur.commande.interfaces.IVisitable;
import fr.p10.miage.m1a.visiteur.commande.interfaces.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class GroupeClient implements IVisitable {

    private String name;
    private List<Client> listClient = new ArrayList<Client>();

    @Override
    public String toString() {
        return "GroupeClient{" +
                "name='" + name + '\'' +
                ", listClient=" + listClient +
                '}';
    }

    public void accept(IVisitor visitor){
        for(Client c : listClient){
            c.accept(visitor);
        }
    }

    public GroupeClient(String name) {
        this.name = name;
    }

    public void addClient(Client c){
        listClient.add(c);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
