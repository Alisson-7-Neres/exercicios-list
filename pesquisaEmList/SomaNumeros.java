package com.dio.collections.pesquisaEmList;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	
	List<Integer> numeros = new ArrayList<>();

	public void adicionarNumero(int numero) {
		numeros.add(numero);
		System.out.println("Número adicionado: " + numero);
	}
	public void calcularSoma() {
		System.out.println("Soma dos números da lista: " + numeros.stream().mapToInt(n -> n).sum());
	}
	public void encontrarMaiorNumero() {
		System.out.println("Maior número da lista: " + numeros.stream().mapToInt(n -> n).max().getAsInt());
	}
	public void encontrarMenorNumero() {
		System.out.println("Menor número da lista: " + numeros.stream().mapToInt(n -> n).min().getAsInt());
	}
	public void exibirNumeros() {
		System.out.println("Lista: " + numeros);
	}
}
