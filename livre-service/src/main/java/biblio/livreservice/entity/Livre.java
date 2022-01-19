package biblio.livreservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Livre {
    @Id
    private String id;
    private String titre;
    private String description;
    private String auteur;
    private int nombreTotale;
    private int nombreRestant;

    public Livre(String id, String titre, String description, String auteur, int nombreTotale,int nombreRestant) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.auteur = auteur;
        this.nombreTotale = nombreTotale;
        this.nombreRestant = nombreRestant;
    }

    public int getNombreRestant() {
        return nombreRestant;
    }

    public void setNombreRestant(int nombreRestant) {
        this.nombreRestant = nombreRestant;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getNombreTotale() {
        return nombreTotale;
    }

    public void setNombreTotale(int nombreTotale) {
        this.nombreTotale = nombreTotale;
    }
}
