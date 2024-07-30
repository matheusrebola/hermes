package hermes.dtos;

import hermes.entities.StatusVeiculo;

public record VeiculosCreateDto (
		String placa,
		String modelo,
		String ano,
		String fabricante,
		StatusVeiculo statusVeiculo) {

}
