package biblio.empruntservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Emprunt {
    @Id
    private String id;
    private String idEtudiant;
    private String idLivre;
    private String dateEmprunt;
    private String dateRetour;

    public Emprunt(String id, String idEtudiant, String idLivre, String dateEmprunt, String dateRetour) {
        this.id = id;
        this.idEtudiant = idEtudiant;
        this.idLivre = idLivre;
        this.dateEmprunt = dateEmprunt;
        this.dateRetour = dateRetour;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(String idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public String getIdLivre() {
        return idLivre;
    }

    public void setIdLivre(String idLivre) {
        this.idLivre = idLivre;
    }

    public String getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(String dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public String getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(String dateRetour) {
        this.dateRetour = dateRetour;
    }
}
