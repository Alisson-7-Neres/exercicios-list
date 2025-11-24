package com.dio.collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main (String[] args) {
		
		Tarefa tarefas = new Tarefa();
		
		// Adicionando tarefas
		List<String> exercicios = new ArrayList<String>();
		exercicios.add("Exercício de lista");
		exercicios.add("Exercício de pesquisa");
		tarefas.adicionarTarefa(exercicios);
		tarefas.obterDescricoesTarefas();
		tarefas.obterNumeroTotalTarefas();
		
		// Removendo tarefas
		tarefas.removerTarefa("lista");
		tarefas.obterDescricoesTarefas();
		
		// Número total de tarefas
		tarefas.obterNumeroTotalTarefas();
		
	}

}
