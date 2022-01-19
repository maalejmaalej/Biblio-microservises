package biblio.empruntservice.controller;



import biblio.empruntservice.entity.Emprunt;
import biblio.empruntservice.service.EmpruntService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/emprunts")
@Slf4j
public class EmpruntController {

    @Autowired
    private EmpruntService empruntService;

    @PostMapping("/")
    public Emprunt saveEmprunt(@RequestBody Emprunt emprunt){
        return empruntService.saveEmprunt(emprunt);
    }

    @GetMapping("/")
    public List<Emprunt> getEmprunts(){
        return empruntService.getEmprunts();
    }

    @GetMapping("/{id}")
    public Optional<Emprunt> getEmprunt(@PathVariable String id){
        return empruntService.getEmprunt(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteEtudiant(@PathVariable String id) {
        return empruntService.deleteEmprunt(id);
    }

}
