package hermes.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hermes.entities.Motoristas;

@Repository
public interface MotoristasRepository extends JpaRepository<Motoristas, UUID> {

}
