package hermes.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;

public record EmpresaDto(
		@NotNull UUID id,
		String nome,
		String endereco,
		String email) {

}
