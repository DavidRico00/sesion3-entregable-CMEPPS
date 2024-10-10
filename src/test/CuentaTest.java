package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {
	
	private Cuenta cuenta1, cuenta2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta1 = new Cuenta(50f, "12345", "Pepe");
		cuenta2 = new Cuenta(0f, "67890", "Juan");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void Test0014() {
		cuenta1.reintegro(200f);
		cuenta2.reintegro(350f);
		cuenta1.ingreso(100f);
		cuenta2.reintegro(200f);
		cuenta2.reintegro(150f);
		cuenta1.reintegro(200f);
		cuenta2.ingreso(50f);
		cuenta2.reintegro(100f);
		
		assertEquals(-250f, cuenta1.getSaldo());
		assertEquals(-500f, cuenta2.getSaldo());
		
	}

}
