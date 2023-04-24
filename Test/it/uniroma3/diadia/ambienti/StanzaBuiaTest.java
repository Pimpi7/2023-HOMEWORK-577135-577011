package it.uniroma3.diadia.ambienti;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;

class StanzaBuiaTest {
	
	private StanzaBuia stanza;
	private Attrezzo attrezzo;
	
	@BeforeEach
	void setUp() {
		stanza = new StanzaBuia("stanza buia");
		attrezzo = new Attrezzo("osso",1);
	}

	@Test
	void testSenzaAttrezzoCercato() {
		assertEquals("Qui c'è buio pesto", this.stanza.getDescrizione());
		System.out.println(this.stanza.getDescrizione());
	}
	
	@Test
	void testConAttrezzoCercato() {
		this.stanza.addAttrezzo(attrezzo);
		this.stanza.getDescrizione();
		System.out.println(this.stanza.getDescrizione());
	}

}
