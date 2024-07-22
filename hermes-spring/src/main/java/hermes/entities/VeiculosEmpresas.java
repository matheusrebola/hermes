package br.org.gestao.hermes.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record VeiculosEmpresas(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		Empresas empresa,
		Veiculos veiculo) {

}
