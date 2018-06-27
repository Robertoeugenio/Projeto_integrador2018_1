package model.javabean;

public class PrestadorServico {
		private String cpfPrestador, nomePrestador;

		public String getCpfPrestador() {
			return cpfPrestador;
		}

		public void setCpfPrestador(String cpfPrestador) {
			this.cpfPrestador = cpfPrestador;
		}

		public String getNomePrestador() {
			return nomePrestador;
		}

		public void setNomePrestador(String nomePrestador) {
			this.nomePrestador = nomePrestador;
		}


		public PrestadorServico(String cpfPrestador, String nomePrestador) {
			super();
			this.cpfPrestador = cpfPrestador;
			this.nomePrestador = nomePrestador;
		}
}
