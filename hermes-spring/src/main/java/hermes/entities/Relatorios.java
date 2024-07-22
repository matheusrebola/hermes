package hermes.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Relatorios(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		TipoRelatorio tipoRelatorio,
		LocalDateTime dataGeracao,
		String conteudo,
		Veiculos veiculo) {

}
