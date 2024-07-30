package hermes.dtos;

import hermes.entities.StatusMotorista;

public record OtimizacoesCreateDto(
		String nome,
		String cnh,
		String telefone,
		String email,
		StatusMotorista statusMotorista) {

}
