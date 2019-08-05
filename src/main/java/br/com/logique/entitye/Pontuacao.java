/**
 * 
 */
package br.com.logique.entitye;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author pcfs
 *
 */
@Getter @Setter
@AllArgsConstructor
public class Pontuacao {

	private int qtdVitoriasJogador1;
	private int qtdVitoriasJogador2;
	private int qtdEmpates;
	private int qtdJogadas = 100;
	
	
	public int getQtdDerrotasJogador1(){
		return qtdJogadas - (qtdVitoriasJogador1 + qtdEmpates);
	}
	
	public int getQtdDerrotasJogador2(){
		return qtdJogadas - (qtdVitoriasJogador2 + qtdEmpates);
	}

}
