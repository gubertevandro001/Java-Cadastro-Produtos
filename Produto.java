package Modelos;

public class Produto {
	
	private int id;
	private String nome;
	private String marca;
	private double preco;
	private int quantidade;
	
	public Produto() {
		
	}

	public Produto(int id, String nome, String marca, double preco, int quantidade) {
		this.id = id;
		this.nome = nome;
		this.marca = marca;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public void entradaProduto(int quantidade) {
		this.quantidade += quantidade;
		
	}
	
	public void saidaProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}
}
