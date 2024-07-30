package hermes.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import hermes.entities.TipoRelatorio;
import hermes.entities.Veiculos;
import jakarta.validation.constraints.NotNull;

public record RelatorioDto(
		@NotNull UUID id,
		TipoRelatorio tipoRelatorio,
		LocalDateTime dataGeracao,
		String conteudo,
		Veiculos veiculo) {

}
