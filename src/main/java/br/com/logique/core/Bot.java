/**
 * 
 */
package br.com.logique.core;

import br.com.logique.Util;
import br.com.logique.entitye.Pontuacao;
import lombok.Getter;
import lombok.Setter;

/**
 * @author pcfs
 *
 */
@Getter @Setter
public class Bot {

	private Pontuacao pontuacao;
	
	private Util processar(Util janken1, Util janken2) {

		if(janken1 == Util.PEDRA && janken2 == Util.TESOURA) {
			return Util.JOGADOR_1_WIN;
		}
		else if(janken1 == Util.PEDRA && janken2 == Util.PAPEL) {
			return Util.JOGADOR_2_WIN;
		}
		else if(janken1 == Util.PEDRA && janken2 == Util.PEDRA) {
			return Util.EMPATE;
		}
		else if(janken1 == Util.TESOURA && janken2 == Util.TESOURA) {
			return Util.EMPATE;
		}
		else if(janken1 == Util.TESOURA && janken2 == Util.PAPEL) {
			return Util.JOGADOR_1_WIN;
		}
		else if(janken1 == Util.TESOURA && janken2 == Util.PEDRA) {
			return Util.JOGADOR_2_WIN;
		}
		else if(janken1 == Util.PAPEL && janken2 == Util.PEDRA) {
			return Util.JOGADOR_1_WIN;
		}
		else if(janken1 == Util.PAPEL && janken2 == Util.TESOURA) {
			return Util.JOGADOR_2_WIN;
		}
		else { //papel x papel
			return Util.EMPATE;
		}
	}

	public void run() {
		setPontuacao(new Pontuacao(0, 0, 0, 100));
		
		Util resultado;
		
		for (int i = 1; i <= 100; i++) {
			resultado = processar(Util.PAPEL, radomJanken(1,3));
			
			if(resultado ==  Util.JOGADOR_1_WIN) {
				pontuacao.setQtdVitoriasJogador1(pontuacao.getQtdVitoriasJogador1() + 1);
			}else if(resultado ==  Util.JOGADOR_2_WIN) {
				pontuacao.setQtdVitoriasJogador2(pontuacao.getQtdVitoriasJogador2() + 1);
			}else {
				pontuacao.setQtdEmpates(pontuacao.getQtdEmpates() + 1);
			}
		}
	}
	
	private Util radomJanken(int min, int max) {

		int random = (int)(Math.random() * max) + min; 

		if(random == 1) {
			return Util.PEDRA;
		}
		else if(random == 2) {
			return Util.PAPEL;
		}
		else {
			return Util.TESOURA;
		}
	}
}
