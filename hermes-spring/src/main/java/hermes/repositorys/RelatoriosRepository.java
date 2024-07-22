package hermes.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hermes.entities.Relatorios;

@Repository
public interface RelatoriosRepository extends JpaRepository<Relatorios, UUID> {

}
