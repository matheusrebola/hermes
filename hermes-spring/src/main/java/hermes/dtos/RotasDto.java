package hermes.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import hermes.entities.Veiculos;
import jakarta.validation.constraints.NotNull;

public record RotasDto(
		@NotNull UUID id,
		String origem,
		String destino,
		LocalDateTime dataPartida,
		LocalDateTime dataChegada,
		Float distancia,
		LocalDateTime tempoEstimado,
		Veiculos veiculo) {

}
