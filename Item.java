package com.dio.collections;

public class Item {
	
	public Item() {}
	public Item(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	private String nome;
	private double preco;
	private int quantidade;
	
	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	
	@Override
	public String toString() {
		return "Nome do produto: " + nome + "\nPreço: " + preco + "\nQuantidade: " + quantidade + "\n";
	}
	
}
