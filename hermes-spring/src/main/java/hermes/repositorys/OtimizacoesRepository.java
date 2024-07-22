package hermes.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hermes.entities.Otimizacoes;

@Repository
public interface OtimizacoesRepository extends JpaRepository<Otimizacoes, UUID> {

}
