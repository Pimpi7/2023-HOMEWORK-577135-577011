package it.uniroma3.diadia.comandi;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Stanza;

class ComandoPrendiTest {
	private ComandoPrendi comando;
	private Partita partita;
	private Stanza stanza1;
	
	@BeforeEach
	void setUp(){
		this.partita = new Partita();
		this.stanza1 = new Stanza("stanza1");
		this.stanza1.addAttrezzo("osso",0);
		this.partita.setStanzaCorrente(stanza1);
	}

	@Test
	void testAttrezzoNull() {
		this.comando = new ComandoPrendi(null);
		comando.esegui(partita);
	}
	@Test
	void testAttrezzoValido() {
		this.comando = new ComandoPrendi("osso");
		comando.esegui(partita);
	}
	@Test
	void testAttrezzoNonValido() {
		this.comando = new ComandoPrendi("libro");
		comando.esegui(partita);
	}
}


