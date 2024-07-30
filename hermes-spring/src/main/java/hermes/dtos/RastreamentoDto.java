package hermes.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import hermes.entities.Veiculos;
import jakarta.validation.constraints.NotNull;

public record RastreamentoDto(
		@NotNull UUID id,
		String latitude,
		String longitude,
		LocalDateTime timestamp,
		Veiculos veiculo) {

}
