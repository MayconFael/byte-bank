package veiculo;

import encapsulamento.Conta;

public class Testacarro {

	public static void main(String[] args) {
		Carro carro1 = new Carro(1234, "VW", "Gol", "Vermelho" );
		Carro carro2 = new Carro(4321, "VW", "Gol", "Azul" );
		

		
		 System.out.println(carro1.getPlaca());
		 System.out.println(carro1.getMarca());
		 System.out.println(carro1.getModelo());
		 System.out.println(carro1.getCor());
		 
		 System.out.println(carro2.getPlaca());
		 System.out.println(carro2.getMarca());
		 System.out.println(carro2.getModelo());
		 System.out.println(carro2.getCor());
	}

}

