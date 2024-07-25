package hermes.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hermes.entities.Rotas;

@Repository
public interface RotasRepository extends JpaRepository<Rotas, UUID> {

}
