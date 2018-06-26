package model.javabean;

public class Orcamento {
	private String dataOrcamento;
	private double valorTotalOrcamento;
	
	
	
	public Orcamento(String dataOrcamento, double valorTotalOrcamento) {
		super();
		this.dataOrcamento = dataOrcamento;
		this.valorTotalOrcamento = valorTotalOrcamento;
	}
	public String getDataOrcamento() {
		return dataOrcamento;
	}
	public void setDataOrcamento(String dataOrcamento) {
		this.dataOrcamento = dataOrcamento;
	}
	public double getValorTotalOrcamento() {
		return valorTotalOrcamento;
	}
	public void setValorTotalOrcamento(double valorTotalOrcamento) {
		this.valorTotalOrcamento = valorTotalOrcamento;
	}
}
