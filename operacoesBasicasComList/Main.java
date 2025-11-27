package com.dio.collections.operacoesBasicasComList;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main (String[] args) {
		
		/*
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
		*/
		
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		
		carrinhoDeCompras.adicionarItem("Smart TV 4k 50 LG", 2116, 1);
		carrinhoDeCompras.adicionarItem("Sofá Retrátil", 699, 1);
		carrinhoDeCompras.exibirItens();
		carrinhoDeCompras.calcularValorTotal();
		
		carrinhoDeCompras.removerItem("Smart");
		carrinhoDeCompras.calcularValorTotal();
		
	}

}
