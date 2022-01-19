package biblio.livreservice.repository;

import biblio.livreservice.entity.Livre;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivreRepository extends MongoRepository<Livre,String> {
}
