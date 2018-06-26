package model.javabean;

public class ProdutoServico {
	private String nomeServico;
	private double valorUnitarioServico;
	private double quantidadeServico;
	private String medida;
	public String getNomeServico() {
		return nomeServico;
	}
	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}
	public double getValorUnitarioServico() {
		return valorUnitarioServico;
	}
	public void setValorUnitarioServico(double valorUnitarioServico) {
		this.valorUnitarioServico = valorUnitarioServico;
	}
	public double getQuantidadeServico() {
		return quantidadeServico;
	}
	public void setQuantidadeServico(double quantidadeServico) {
		this.quantidadeServico = quantidadeServico;
	}
	public String getMedida() {
		return medida;
	}
	public void setMedida(String medida) {
		this.medida = medida;
	}
	public ProdutoServico(String nomeServico, double valorUnitarioServico, double quantidadeServico, String medida) {
		super();
		this.nomeServico = nomeServico;
		this.valorUnitarioServico = valorUnitarioServico;
		this.quantidadeServico = quantidadeServico;
		this.medida = medida;
	}
	
}
