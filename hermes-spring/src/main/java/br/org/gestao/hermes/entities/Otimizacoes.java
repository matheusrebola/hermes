package br.org.gestao.hermes.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Otimizacoes(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		BigDecimal custoOperacional,
		BigDecimal eficiencia,
		LocalDateTime dataAnalisada,
		Veiculos veiculo) {

}
