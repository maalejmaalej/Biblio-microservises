package biblio.livreservice.service;

import biblio.livreservice.entity.Livre;
import biblio.livreservice.repository.LivreRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class LivreServie {
    @Autowired
    private LivreRepository livreRepository;
    public Livre saveLivre(Livre livre) {
        return livreRepository.save(livre);
    }


    public List<Livre> getLivres() {
        return livreRepository.findAll();
    }
    public Optional<Livre> getLivre(String id) {
        return livreRepository.findById(id);
    }

    public String deleteEtudiant(String id) {
        livreRepository.deleteById(id);
        return "Livre deleted with cin : " + id;
    }
}
