package hermes.dtos;

import java.time.LocalDateTime;

import hermes.entities.Veiculos;

public record RastreamentoCreateDto(
		String latitude,
		String longitude,
		LocalDateTime timestamp,
		Veiculos veiculo) {

}
