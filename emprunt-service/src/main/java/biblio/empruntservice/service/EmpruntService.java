package biblio.empruntservice.service;

import biblio.empruntservice.entity.Emprunt;
import biblio.empruntservice.repository.EmpruntRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class EmpruntService {
    @Autowired
    private EmpruntRepository empruntRepository;

    public Emprunt saveEmprunt(Emprunt emprunt) {
        return empruntRepository.save(emprunt);
    }


    public List<Emprunt> getEmprunts() {
        return empruntRepository.findAll();
    }
    public Optional<Emprunt> getEmprunt(String id) {
        return empruntRepository.findById(id);
    }

    public String deleteEmprunt(String id) {
        empruntRepository.deleteById(id);
        return "Emprunt deleted with id : " + id;
    }
}
