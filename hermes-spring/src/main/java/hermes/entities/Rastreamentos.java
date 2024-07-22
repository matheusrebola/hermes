package hermes.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Rastreamentos(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String latitude,
		String longitude,
		LocalDateTime timestamp,
		Veiculos veiculo) {

}
