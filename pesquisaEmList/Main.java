package com.dio.collections.pesquisaEmList;

public class Main {
	
	public static void main(String[] args) {
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		
		catalogoLivros.adicionarLivro("Dexter - A mão esquerda de Deus", "Jeff Lindsay", 2004);
		catalogoLivros.adicionarLivro("Querido e Devoto Dexter", "Jeff Lindsay", 2005);
		catalogoLivros.adicionarLivro("A garota do lago", "Charlie Donlea", 2017);
		
	//	System.out.println(catalogoLivros.pesquisarPorAutor("Jeff"));
		
	//	catalogoLivros.pesquisarPorIntervaloAnos(2014, 2015);
		
		System.out.println(catalogoLivros.pesquisarPorTitulo("Dexter"));
	}

}
