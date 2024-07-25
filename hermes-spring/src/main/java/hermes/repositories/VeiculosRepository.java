package hermes.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hermes.entities.Veiculos;

@Repository
public interface VeiculosRepository extends JpaRepository<Veiculos, UUID> {

}
