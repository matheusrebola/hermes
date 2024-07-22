package hermes.entities;

import jakarta.persistence.Entity;

@Entity
public record VeiculosEmpresas(
		Empresas empresa,
		Veiculos veiculo) {

}
