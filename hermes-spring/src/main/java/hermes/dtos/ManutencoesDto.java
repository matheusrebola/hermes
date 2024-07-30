package hermes.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import hermes.entities.StatusManutencao;
import hermes.entities.TipoServico;
import hermes.entities.Veiculos;
import jakarta.validation.constraints.NotNull;

public record ManutencoesDto(
		@NotNull UUID id,
		TipoServico tipoServico,
		LocalDateTime dataAgendada,
		LocalDateTime dataRealizada,
		String descricao,
		StatusManutencao statusManutencao,
		Veiculos veiculo) {

}
