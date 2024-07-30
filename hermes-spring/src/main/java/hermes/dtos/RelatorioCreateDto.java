package hermes.dtos;

import java.time.LocalDateTime;

import hermes.entities.TipoRelatorio;
import hermes.entities.Veiculos;

public record RelatorioCreateDto(
		TipoRelatorio tipoRelatorio,
		LocalDateTime dataGeracao,
		String conteudo,
		Veiculos veiculo) {

}
