package br.org.gestao.hermes.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Rotas(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String origem,
		String destino,
		LocalDateTime dataPartida,
		LocalDateTime dataChegada,
		Float distancia,
		LocalDateTime tempoEstimado,
		Veiculos veiculo) {

}
