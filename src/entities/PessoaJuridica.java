package entities;

public class PessoaJuridica extends Contribuinte {
	//atrib
	private Integer numFuncionarios;
	
	//constr
	public PessoaJuridica(String nome, Double rendaAnual, Integer numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}
	
	public PessoaJuridica() {
		
	}
	
	//get-set
	public Integer getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(Integer numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	//met-herdado
	@Override
	public double impostoDeRenda() {
		double impostoJuridico = numFuncionarios > 10 ? getRendaAnual() * 0.14 : getRendaAnual() * 0.16;
		
		return impostoJuridico;
	}

}
