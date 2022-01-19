package biblio.empruntservice.repository;

import biblio.empruntservice.entity.Emprunt;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpruntRepository extends MongoRepository<Emprunt,String> {
}
