package it.uniroma3.diadia;

import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.giocatore.*;

/**
 * Questa classe modella una partita del gioco
 *
 * @author  docente di POO e 577135
 * @see Labirinto
 * @version 2.0
 */

public class Partita {
	
	private Labirinto labirinto;
	private Giocatore giocatore;
	private Stanza stanzaCorrente;
	private Stanza stanzaVincente;
	private boolean finita;

	
	public Partita(){ 
		this.labirinto = new Labirinto();
		this.giocatore = new Giocatore();
		this.finita = false;
		//this.cfu = CFU_INIZIALI;
		this.stanzaCorrente = this.labirinto.getStanzaIniziale();
		this.stanzaVincente = this.labirinto.getStanzaFinale();
	}
	public Giocatore getGiocatore() {
		return giocatore;
	}
	public Stanza getStanzaVincente() {
		return stanzaVincente;
	}
	public void setStanzaVincente(Stanza stanzaVincente) {
		this.stanzaVincente = stanzaVincente;
	}

	public void setStanzaCorrente(Stanza stanzaCorrente) {
		this.stanzaCorrente = stanzaCorrente;
	}

	public Stanza getStanzaCorrente() {
		return this.stanzaCorrente;
	}
	
	
	/**
	 * Restituisce vero se e solo se la partita e' stata vinta
	 * @return vero se partita vinta
	 */
	public boolean vinta() {
		return this.getStanzaCorrente()== this.getStanzaVincente();
	}

	/**
	 * Restituisce vero se e solo se la partita e' finita
	 * @return vero se partita finita
	 */
	public boolean isFinita() {
		return finita || vinta() || (this.giocatore.getCfu() == 0);
	}

	/**
	 * Imposta la partita come finita
	 *
	 */
	public void setFinita() {
		this.finita = true;
	}
}