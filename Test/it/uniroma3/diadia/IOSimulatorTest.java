package it.uniroma3.diadia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class IOSimulatorTest {
	
	@BeforeEach
	void SetUp() {
		
	}

	@Test
	void testUnSoloComando() {
		assertEquals("fine", new IOSimulator("fine").leggiRiga());
	}
	
	@Test
	void testDueComandi() {
		IOSimulator io = new IOSimulator("vai Nord","fine");
		assertEquals("vai Nord", io.leggiRiga());
		assertEquals("fine", io.leggiRiga());
	}
	@Test
	void testNessunComando() {
		assertNull(new IOSimulator().leggiRiga());
	}
	@Test
	void testTroppeLetture() {
		IOSimulator io = new IOSimulator("fine");
		assertEquals("fine", io.leggiRiga());
		io.leggiRiga();
	}
}
