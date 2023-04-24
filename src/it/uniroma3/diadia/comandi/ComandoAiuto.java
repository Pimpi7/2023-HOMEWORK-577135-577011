package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;

public class ComandoAiuto implements Comando{
	private IO io;
	private String nome;
	static final private String[] elencoComandi = {"vai", "aiuto", "fine", "prendi", "posa","guarda"};
	
	public ComandoAiuto() {
		this.nome = new String("aiuto");
		this.io = new IOConsole();
	}
	@Override
	public void esegui(Partita partita) {
		for(int i=0; i< elencoComandi.length; i++) 
			this.io.mostraMessaggio(elencoComandi[i]+" ");
	}
	
	@Override
	public void setParametro(String parametro) {
	}
	@Override
	public String getParametro() {
		return null;
	}
	@Override
	public String getNome() {
		return this.nome;
	}
}
