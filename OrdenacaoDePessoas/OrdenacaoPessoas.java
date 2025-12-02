package com.dio.collections.OrdenacaoDePessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas {

	List<Pessoa> pessoas = new ArrayList<>();

	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoas.add(new Pessoa(nome, idade, altura));
	}

	public List<Pessoa> ordenarPorIdade() {
		Collections.sort(pessoas);
		return pessoas;
	}

	public List<Pessoa> ordenarPorAltura() {
		Collections.sort(pessoas, Comparator.comparing(Pessoa::getAltura));
		return pessoas;
	}

}
