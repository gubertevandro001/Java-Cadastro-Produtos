package Menus;

import java.util.Scanner;

import Controle.ControleProduto;

public class MenuProduto {
	
	Scanner sc = new Scanner (System.in);
	
	ControleProduto controleProduto = new ControleProduto();

	public void entrarMenu() {
		System.out.println("----Menu dos Produtos----\n1 - Cadastrar Produto\n2 - Excluir Produto\n3 - Procurar produto\n4 - Alterar Produto\n5 - Sair\nInforme: ");
		int opcao = sc.nextInt();
		
		if (opcao == 1) {
			controleProduto.Cadastrar();
			entrarMenu();
		}
		else if (opcao == 2) {
			controleProduto.Excluir();
			entrarMenu();
		}
		else if (opcao == 3){
			controleProduto.Pesquisar();
			entrarMenu();
		}
		else if (opcao == 4) {
			controleProduto.Alterar();
			entrarMenu();
		}
		else if (opcao == 5) {
			System.out.println("Sistema Encerrado!");
		}
		else {
			System.out.println("Opção Inválida!");
			entrarMenu();
		}		
	}
}