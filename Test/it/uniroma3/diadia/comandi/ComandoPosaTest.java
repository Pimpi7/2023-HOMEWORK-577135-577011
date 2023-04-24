package it.uniroma3.diadia.comandi;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.attrezzi.Attrezzo;

class ComandoPosaTest {
	private ComandoPosa comando;
	private Partita partita;
	private Stanza stanza1;
	private Attrezzo attrezzo;
	
	
	@BeforeEach
	void setUp() {
		this.partita = new Partita();
		this.stanza1 = new Stanza("Stanza 1");
		this.attrezzo = new Attrezzo("Osso",4);
		
		this.partita.getGiocatore().getBorsa().addAttrezzo(attrezzo);
		this.partita.setStanzaCorrente(stanza1);
	}

	@Test
	void testAttrezzoNull() {
		this.comando = new ComandoPosa(null);
		comando.esegui(partita);
	}
	@Test
	void testAttrezzoValido() {
		this.comando = new ComandoPosa("Osso");
		comando.esegui(partita);
	}
	@Test
	void testAttrezzoNonValido() {
		this.comando = new ComandoPosa("libro");
		comando.esegui(partita);
	}

}
