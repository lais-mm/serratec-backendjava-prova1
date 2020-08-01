package br.com.senai.ipva;

public class Ipva extends Veiculo {
		protected double valorIPVA;
		protected double taxaLicenciamento;
		

		public Ipva(String modelo, String placa, String combustivel, double valorVeiculo, double taxaLicenciamento) {
			super(modelo, placa, combustivel, valorVeiculo);
			this.taxaLicenciamento = taxaLicenciamento;
		}



		public double getValorIPVA() {
			return valorIPVA;
		}



		public double getTaxaLicenciamento() {
			return taxaLicenciamento;
		}
		

		@Override
		public String toString() {
			return "Veiculo Modelo: " + modelo + "\nPlaca: " + placa + "\nCombustível: " + combustivel + "\nValor do veículo: " + valorVeiculo + "\nTaxa de Licenciamento: " + taxaLicenciamento;
		}



		public void calcularIpva() {
			if (combustivel.equalsIgnoreCase("GNV")) {
				valorIPVA = (valorVeiculo * 0.01) + taxaLicenciamento;
				
			}else if (combustivel.equalsIgnoreCase("FLEX")) {
				valorIPVA = (valorVeiculo * 0.03) + taxaLicenciamento;
				
			} else {
				valorIPVA = (valorVeiculo * 0.04) + taxaLicenciamento;
			}
		}
}
