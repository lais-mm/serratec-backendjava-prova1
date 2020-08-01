package br.com.senai.ipva.teste;

import br.com.senai.ipva.Ipva;

public class IpvaTeste {

	public static void main(String[] args) {
		
		Ipva veiculo1 = new Ipva("Sandero", "LVC-5438", "GNV", 55000, 125);
		
		veiculo1.calcularIpva();
		System.out.println(veiculo1);		
		System.out.println("Valor do IPVA: " + veiculo1.getValorIPVA() + "\n");

		Ipva veiculo2 = new Ipva("Fiesta", "MVC-1212", "Flex", 40000, 140);
				
		veiculo2.calcularIpva();
		System.out.println(veiculo2);		
		System.out.println("Valor do IPVA: " + veiculo2.getValorIPVA());
		
	}

}
