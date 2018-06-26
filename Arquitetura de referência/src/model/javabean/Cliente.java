package model.javabean;

public class Cliente {
 private String cpfCliente, nomeCliente, fazenda;

 
public Cliente(String cpfCliente, String nomeCliente, String fazenda) {
	super();
	this.cpfCliente = cpfCliente;
	this.nomeCliente = nomeCliente;
	this.fazenda = fazenda;
}


public String getCpfCliente() {
	return cpfCliente;
}


public void setCpfCliente(String cpfCliente) {
	this.cpfCliente = cpfCliente;
}


public String getNomeCliente() {
	return nomeCliente;
}


public void setNomeCliente(String nomeCliente) {
	this.nomeCliente = nomeCliente;
}


public String getFazenda() {
	return fazenda;
}


public void setFazenda(String fazenda) {
	this.fazenda = fazenda;
}
}
