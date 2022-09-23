package veiculo;

public class Carro {
	
	private int placa;
	private String marca;
	private String modelo;
	private String cor;
	
	public Carro(int placa, String marca, String modelo, String cor) {
		this.placa  =  placa;
		this.marca  = marca;
		this.modelo = modelo;
		this.cor    = cor; 
	}
	public int getPlaca() {
		return this.placa;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	public String getCor() {
		return this.cor;
	}
	
	}
	
