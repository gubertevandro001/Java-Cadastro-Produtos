package Controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Modelos.Produto;

public class ControleProduto {
	
	Scanner sc = new Scanner (System.in);
	
	List<Produto> produtos = new ArrayList<>();
	
	public void Cadastrar() {
		System.out.println("ID: ");
		int id = sc.nextInt();
		System.out.println("Nome: ");
		String nome = sc.next();
		System.out.println("Marca: ");
		String marca = sc.next();
		System.out.println("Preco: ");
		double preco = sc.nextDouble();
		System.out.println("Quantidade: ");
		int quantidade = sc.nextInt();
		
		produtos.add(new Produto(id, nome, marca, preco, quantidade));
		
		System.out.println("Produto Cadastrado com Sucesso!");
		
	}
	
	public void Excluir() {
		System.out.println("Digite o ID do Produto que Deseja Excluir: ");
		int idExcluir = sc.nextInt();
		
		Produto prod = produtos.stream().filter(produto -> produto.getId() == idExcluir).findFirst().orElse(null);
		
		if (prod == null) {
			System.out.println("Produto Não Econtrado!");
		}
		else {
			produtos.remove(prod);
			System.out.println("Produto Excluido Com Sucesso!");
		}
	}
	
	public void Pesquisar() {
		System.out.println("Digite o ID do Produto: ");
		int idProcura = sc.nextInt();
		
		Produto prod = produtos.stream().filter(produto -> produto.getId() == idProcura).findFirst().orElse(null); 
		
		if (prod == null) {
			System.out.println("Produto Não Encontrado!");
		}
		else {
			System.out.println("\nID: " + prod.getId() + "\nNome: " + prod.getNome() + "\nMarca: " + prod.getMarca() + "\nPreco: " + prod.getPreco() + "\nQuantidade: " + prod.getQuantidade());
		}
	}
	
	public void Alterar() {
		System.out.println("Digite o ID do Produto: ");
		int idAlterar = sc.nextInt();
		
		Produto prod = produtos.stream().filter(produto -> produto.getId() == idAlterar).findFirst().orElse(null);
		
		if (prod == null) {
			System.out.println("Produto Não Encontrado!");
		}
		else {
			System.out.println("\nID: " + prod.getId() + "\nNome: " + prod.getNome() + "\nMarca: " + prod.getMarca() + "\nPreco: " + prod.getPreco() + "\nQuantidade: " + prod.getQuantidade() + "\n");
			
			System.out.println("\nQual Operação Deseja Realizar?\n1- Entrada no Estoque\n2 - Saída no Estoque\n3 - Alterar Nome\nInforme: ");
			int opcao = sc.nextInt();
			
			switch (opcao) {
			
			case 1:
				System.out.println("Informe a Quantidade: ");
				int quantidadeEntrada = sc.nextInt();
				prod.entradaProduto(quantidadeEntrada);
				System.out.println("Estoque Alterado com Sucesso!");
				break;
				
			case 2:
				System.out.println("Informe a Quantidade: ");
				int quantidadeSaida = sc.nextInt();
				prod.saidaProduto(quantidadeSaida);		
			    System.out.println("Estoque Alterado com Sucesso!");
			    break;
			
			case 3: 
				System.out.println("Informe o Novo Nome: ");
				String nome = sc.next();
				prod.setNome(nome);
				System.out.println("Nome Alterado com Sucesso!");
				break;
			}
		}	
	}	
	
}
