package biblio.etudiantservice.service;

import biblio.etudiantservice.entity.Etudiant;
import biblio.etudiantservice.repository.EtudiantRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class EtudiantService {
    @Autowired
    private EtudiantRepository etudiantRepository;

    public Etudiant saveEtudiant(Etudiant etudiant) {
        log.info("saveEtudiant service");
        return etudiantRepository.save(etudiant);
    }


    public List<Etudiant> getEtudiants() {
        return etudiantRepository.findAll();
    }
    public Optional<Etudiant> getEtudiant(String id) {
        return etudiantRepository.findById(id);
    }

    public String deleteEtudiant(String id) {
        etudiantRepository.deleteById(id);
        return "Etudiant deleted with cin : " + id;
    }
}
