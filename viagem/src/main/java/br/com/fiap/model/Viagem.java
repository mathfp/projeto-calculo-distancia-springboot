package br.com.fiap.model;

public class Viagem {
	private String destino;
	private String origem;
	private double distancia;
	private double velocidadeMedia;
	private String duracaoViagem;
	
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	public double getVelocidadeMedia() {
		return velocidadeMedia;
	}
	public void setVelocidadeMedia(double velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}
	public String getDuracaoViagem() {
		return duracaoViagem;
	}
	public void setDuracaoViagem(String duracaoViagem) {
		this.duracaoViagem = duracaoViagem;
	}
}
