package biblio.etudiantservice.repository;

import biblio.etudiantservice.entity.Etudiant;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository extends MongoRepository<Etudiant,String> {

}
