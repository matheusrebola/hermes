package hermes.dtos;

import java.util.UUID;

import hermes.entities.StatusMotorista;
import jakarta.validation.constraints.NotNull;

public record OtimizacoesDto(
		@NotNull UUID id,
		String nome,
		String cnh,
		String telefone,
		String email,
		StatusMotorista statusMotorista) {

}
