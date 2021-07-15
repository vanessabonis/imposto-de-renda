package entities;

public abstract class Contribuinte {
	//ATRIBUTOS
	private String nome;
	private Double rendaAnual;
	
	//CONSTRUTORES
	public Contribuinte() {
		
	}

	public Contribuinte(String nome, Double rendaAnual) {
		super();
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}
	
	//GET-SET
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	//MÉTODOS
	//método abstrato
	public abstract double impostoDeRenda();
	
	
}
