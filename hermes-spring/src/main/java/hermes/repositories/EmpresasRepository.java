package hermes.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hermes.entities.Empresas;

@Repository
public interface EmpresasRepository extends JpaRepository<Empresas, UUID> {

}
