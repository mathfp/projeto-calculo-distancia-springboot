package br.com.fiap.service;

import br.com.fiap.dto.ViagemDto;

public class ViagemCalculoService {
	
	public void calcularViagem(ViagemDto viagem){
		double tempoViagem = viagem.getDistancia()/viagem.getVelocidadeMedia();
		int divisor = ((int) Math.ceil(tempoViagem * 10)) % 10;
		int inteiro = (int)((tempoViagem * 10) - divisor)/10;
		divisor *= 6;
		viagem.setDuracaoViagem(inteiro+"h "+divisor+" minutos");
	}
}
