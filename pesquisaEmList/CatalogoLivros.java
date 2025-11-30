package com.dio.collections.pesquisaEmList;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CatalogoLivros {

	List<Livro> livros = new ArrayList<>();

	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livros.add(new Livro(titulo, autor, anoPublicacao));
	}

	public List<Livro> pesquisarPorAutor(String autor) {
		return livros.stream().filter(l -> l.getAutor().contains(autor)).collect(Collectors.toList());
	}

	public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		for (Livro livro : livros) {
			if(livro.getAnoPublicacao() == anoInicial || livro.getAnoPublicacao() == anoFinal) {
				System.out.println(livro.toString());
			} else {
				System.err.println("Nenhum livro neste intervalo de tempo");
				break;
			}
		}
	}

	public Optional<Livro> pesquisarPorTitulo(String titulo) {
		// return livros.stream().filter(l -> l.getTitulo().contains(titulo)).collect(Collectors.toList());
		return livros.stream().filter(l -> l.getTitulo().contains(titulo)).findFirst();
	}

}
