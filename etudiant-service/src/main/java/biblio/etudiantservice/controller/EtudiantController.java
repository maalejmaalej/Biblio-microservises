package biblio.etudiantservice.controller;

import biblio.etudiantservice.entity.Etudiant;
import biblio.etudiantservice.service.EtudiantService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/etudiants")
@Slf4j
public class EtudiantController {

    @Autowired
    private EtudiantService etudiantService;

    @PostMapping("/")
    public Etudiant saveEtudiant(@RequestBody Etudiant etudiant){
        log.info("saveEtudiant ctr");
        return etudiantService.saveEtudiant(etudiant);
    }

    @GetMapping("/")
    public List<Etudiant> getEtudiants(){
        return etudiantService.getEtudiants();
    }

    @GetMapping("/{id}")
    public Optional<Etudiant> getEtudiant(@PathVariable String id){
        return etudiantService.getEtudiant(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteEtudiant(@PathVariable String id) {
        return etudiantService.deleteEtudiant(id);
    }

}
