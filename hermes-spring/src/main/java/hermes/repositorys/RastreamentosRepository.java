package hermes.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hermes.entities.Rastreamentos;

@Repository
public interface RastreamentosRepository extends JpaRepository<Rastreamentos, UUID> {

}
