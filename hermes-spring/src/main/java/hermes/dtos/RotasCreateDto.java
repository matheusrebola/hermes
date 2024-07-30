package hermes.dtos;

import java.time.LocalDateTime;

import hermes.entities.Veiculos;

public record RotasCreateDto(
		String origem,
		String destino,
		LocalDateTime dataPartida,
		LocalDateTime dataChegada,
		Float distancia,
		LocalDateTime tempoEstimado,
		Veiculos veiculo) {

}
