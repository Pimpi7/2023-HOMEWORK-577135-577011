package it.uniroma3.diadia.ambienti;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;

class StanzaMagicaTest {
	private StanzaMagica stanzaMagica;
	private Attrezzo attrezzo1;
	
	@BeforeEach
	void setUp() {
		this.stanzaMagica = new StanzaMagica("stanza magica",1);
		this.attrezzo1 = new Attrezzo("lanterna", 3);
	}

	@Test
	void testIsMagic() {
		assertTrue(this.stanzaMagica.addAttrezzo(attrezzo1));
		assertSame(this.stanzaMagica.getAttrezzo("lanterna"), this.attrezzo1);
	}
	
	@Test
	void testIsNotMagic() {
		for(int i=0; i<StanzaMagica.SOGLIA_MAGICA_DEFAULT-1; i++) {
			Attrezzo attrezzoI = new Attrezzo("attrezzo"+i,1);
			assertTrue(this.stanzaMagica.addAttrezzo(attrezzoI));
		}
		Attrezzo maggico = new Attrezzo("maggico",1);
		this.stanzaMagica.addAttrezzo(maggico);
		assertNull(this.stanzaMagica.getAttrezzo("maggico"));
		Attrezzo ogicam = this.stanzaMagica.getAttrezzo("ociggam");
		assertNotNull(ogicam);
		assertEquals(new Attrezzo("ociggam", 2), ogicam);
	}
}
	
