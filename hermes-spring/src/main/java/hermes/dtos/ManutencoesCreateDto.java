package hermes.dtos;

import java.time.LocalDateTime;

import hermes.entities.StatusManutencao;
import hermes.entities.TipoServico;
import hermes.entities.Veiculos;

public record ManutencoesCreateDto(
		TipoServico tipoServico,
		LocalDateTime dataAgendada,
		LocalDateTime dataRealizada,
		String descricao,
		StatusManutencao statusManutencao,
		Veiculos veiculo) {

}
