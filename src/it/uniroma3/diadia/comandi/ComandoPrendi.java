package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class ComandoPrendi implements Comando {
	private IO io;
	private String nomeAttrezzo;
	private String nome;
	
	public ComandoPrendi(String nomeAttrezzo) {
		this.nomeAttrezzo = nomeAttrezzo;
		this.io = new IOConsole();
		this.nome = new String("prendi");
	}
	
	
	@Override
	public void esegui(Partita partita) {
		if(nomeAttrezzo == null)
			this.io.mostraMessaggio("Quale attrezzo vuoi prendere?");
		else {
			Attrezzo toTakeAttrezzo = null;
			toTakeAttrezzo = partita.getStanzaCorrente().getAttrezzo(nomeAttrezzo);
			if(toTakeAttrezzo == null)
				this.io.mostraMessaggio("Attrezzo inesistente");
			else {
				if(partita.getStanzaCorrente().removeAttrezzo(nomeAttrezzo)) 
					partita.getGiocatore().getBorsa().addAttrezzo(toTakeAttrezzo);
				this.io.mostraMessaggio("Attrezzo preso");
			}
		}
	}

	@Override
	public void setParametro(String parametro) {
		this.nomeAttrezzo = parametro;
	}

	@Override
	public String getParametro() {
		return nomeAttrezzo;
	}


	@Override
	public String getNome() {
		return nome;
	}
}