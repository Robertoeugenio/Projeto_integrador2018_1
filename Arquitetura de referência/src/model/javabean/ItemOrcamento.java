package model.javabean;

public class ItemOrcamento {
      private double valorUnitarioOrcamento, quantidadeItemOrcamento;

	public ItemOrcamento(double valorUnitarioOrcamento, double quantidadeItemOrcamento) {
		super();
		this.valorUnitarioOrcamento = valorUnitarioOrcamento;
		this.quantidadeItemOrcamento = quantidadeItemOrcamento;
	}

	public double getValorUnitarioOrcamento() {
		return valorUnitarioOrcamento;
	}

	public void setValorUnitarioOrcamento(double valorUnitarioOrcamento) {
		this.valorUnitarioOrcamento = valorUnitarioOrcamento;
	}

	public double getQuantidadeItemOrcamento() {
		return quantidadeItemOrcamento;
	}

	public void setQuantidadeItemOrcamento(double quantidadeItemOrcamento) {
		this.quantidadeItemOrcamento = quantidadeItemOrcamento;
	}
      
      
}
