/**
 * 
 */
package br.com.logique.view;

import java.util.ArrayList;
import java.util.List;

import br.com.logique.entitye.Pontuacao;


/**
 * @author pcfs
 *
 */
public class InterfaceTexto {

	private List<String> texto;

	public List<String> imprimirPlacar(Pontuacao pontuacao) {
		texto = new ArrayList<String>();
		
		texto.add("###############################################");
		texto.add("#            J a n k e n  -  p o n            #");
		texto.add("###############################################");
		texto.add("===============================================");
		texto.add("jogador (x)|VITORIA(s) |DERROTA(s) |EMPATE(s) |");
		texto.add("-----------------------------------------------");		
		texto.add("jogador (1)| "+pontuacao.getQtdVitoriasJogador1()+"        | "
		+pontuacao.getQtdDerrotasJogador1()+"        | "+pontuacao.getQtdEmpates()+"       |");
		texto.add("-----------------------------------------------");
		texto.add("jogador (2)| "+pontuacao.getQtdVitoriasJogador2()+"        | "
		+pontuacao.getQtdDerrotasJogador2()+"        | "+pontuacao.getQtdEmpates()+"       |");
		texto.add("-----------------------------------------------");
		
		return texto;
	}
	
}
