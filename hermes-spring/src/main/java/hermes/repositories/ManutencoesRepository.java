package hermes.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hermes.entities.Manutencoes;

@Repository
public interface ManutencoesRepository extends JpaRepository<Manutencoes, UUID> {

}
