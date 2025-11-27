package com.dio.collections;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	List<Item> itens = new ArrayList<>();
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		itens.add(new Item(nome, preco, quantidade));
	}
	public void removerItem(String nome) {
		
		if (!nome.isEmpty()) {
			itens.removeIf(i -> i.getNome().contains(nome));
			System.err.println("Produto removido! " + nome);
			exibirItens();
		}
	}
	public void calcularValorTotal() {
		System.out.println("Total: " + itens.stream().mapToDouble(i -> i.getPreco() * i.getQuantidade()).sum());
	}
	public void exibirItens() {
		itens.forEach(i -> System.out.println(i));
	}

	
}
