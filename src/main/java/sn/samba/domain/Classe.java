package sn.samba.domain;

public class Classe {
    private int id;
    private String libelle;
    private String matiere ;

    public Classe(int id, String libelle, String matiere) {
        this.id = id;
        this.libelle = libelle;
        this.matiere = matiere;
    }

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getMatiere() {
        return matiere;
    }
}
