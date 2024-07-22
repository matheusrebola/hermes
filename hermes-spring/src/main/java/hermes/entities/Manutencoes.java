package hermes.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Manutencoes(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		TipoServico tipoServico,
		LocalDateTime dataAgendada,
		LocalDateTime dataRealizada,
		String descricao,
		StatusManutencao statusManutencao,
		Veiculos veiculo) {

}
