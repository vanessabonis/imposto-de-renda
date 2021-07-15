package entities;

public class PessoaFisica extends Contribuinte {
	//atributos
	private Double despesaSaude;
	
	//CONSTRUTOR
	public PessoaFisica(String nome, Double rendaAnual, Double despesaSaude) {
		super(nome, rendaAnual);
		this.despesaSaude = despesaSaude;
	}

	public PessoaFisica() {
		
	}
	
	//GET-SET
	public Double getDespesaSaude() {
		return despesaSaude;
	}

	public void setDespesaSaude(Double despesaSaude) {
		this.despesaSaude = despesaSaude;
	}
	
	//MÉTODO-herdado
	@Override
	public double impostoDeRenda() {
		
		double impostoBasico = (getRendaAnual() < 20000.0) ? getRendaAnual() * 0.15 : getRendaAnual() * 0.25;
		impostoBasico -= (getDespesaSaude() * 0.5);
		
		if(impostoBasico < 0.0) {
			impostoBasico = 0.0;
		}
		
		return impostoBasico;
	}
	
}
