package br.org.gestao.hermes.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Veiculos(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String placa,
		String modelo,
		String ano,
		String fabricante,
		StatusVeiculo statusVeiculo) {

}
