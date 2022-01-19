package biblio.livreservice.controller;

import biblio.livreservice.entity.Livre;
import biblio.livreservice.service.LivreServie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/livres")
@Slf4j
public class LivreController {
    @Autowired
    private LivreServie livreServie;

    @PostMapping("/")
    public Livre saveEtudiant(@RequestBody Livre livre){
        return livreServie.saveLivre(livre);
    }

    @GetMapping("/")
    public List<Livre> getLivres(){
        return livreServie.getLivres();
    }

    @GetMapping("/{id}")
    public Optional<Livre> getLivre(@PathVariable String id){
        return livreServie.getLivre(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteLivre(@PathVariable String id) {
        return livreServie.deleteEtudiant(id);
    }

}
