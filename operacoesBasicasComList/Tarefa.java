package com.dio.collections.operacoesBasicasComList;

import java.util.List;

public class Tarefa {

	List<String> descricao;

	public List<String> getDescricao() {
		return descricao;
	}

	public void adicionarTarefa(List<String> descricao) {
		this.descricao = descricao;
	}

	public void removerTarefa(String descricaoRemove) {
		if (descricao.stream().anyMatch(item -> item.toLowerCase().contains(descricaoRemove))) {
			descricao.removeIf(c-> c.contains(descricaoRemove));
			System.err.println("Tarefa removida: ");
			System.err.println(descricaoRemove);
		}
	}

	public void obterNumeroTotalTarefas() {
		int size = descricao.size();
		System.out.println(size);
	}

	public void obterDescricoesTarefas() {
		try {
			if (!descricao.isEmpty()) {
				descricao.stream().forEach(System.out::println);
			}
		} catch (NullPointerException nullPointerException) {
			System.err.println("Lista vázia");
		}
	}

}
