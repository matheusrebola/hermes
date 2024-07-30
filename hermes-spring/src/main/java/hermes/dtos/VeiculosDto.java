package hermes.dtos;

import java.util.UUID;

import hermes.entities.StatusVeiculo;
import jakarta.validation.constraints.NotNull;

public record VeiculosDto(
		@NotNull UUID id,
		String placa,
		String modelo,
		String ano,
		String fabricante,
		StatusVeiculo statusVeiculo) {

}
