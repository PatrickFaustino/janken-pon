/**
 * 
 */
package br.com.logique;


import br.com.logique.core.Bot;
import br.com.logique.view.InterfaceTexto;

/**
 * @author pcfs
 *
 */
public class Main {

	public static void main(String[] args){

		Bot bot = new Bot();
		InterfaceTexto placar = new InterfaceTexto();
		
        bot.run();
        placar.imprimirPlacar(bot.getPontuacao()).forEach(System.out::println);
        
	}
}
