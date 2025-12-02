package com.dio.collections.OrdenacaoDePessoas;

public class Main {
	
	public static void main(String[] args) {
		
		OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
		
		ordenacaoPessoas.adicionarPessoa("Mariana Alves Duarte", 38, 1.67);
		ordenacaoPessoas.adicionarPessoa("Rafael Gomes Nascimento", 34, 1.79);
		ordenacaoPessoas.adicionarPessoa("Juliana Ferreira Costa", 22, 1.60);
		ordenacaoPessoas.adicionarPessoa("Lucas Andrade Monteiro", 30, 1.82);
		ordenacaoPessoas.adicionarPessoa("Camila Rocha Martins", 25, 1.70);
		
		System.out.println(ordenacaoPessoas.ordenarPorIdade());
		
		System.out.println(ordenacaoPessoas.ordenarPorAltura());
	}

}
