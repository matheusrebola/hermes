package br.org.gestao.hermes.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Motoristas(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String nome,
		String cnh,
		String telefone,
		String email,
		StatusMotorista statusMotorista) {

}
