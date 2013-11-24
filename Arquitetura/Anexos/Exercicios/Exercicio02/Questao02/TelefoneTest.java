package Questao02;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TelefoneTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
		
		
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
		TelefoneCelular celular = new TelefoneCelular();
		TelefoneFixo    fixo    = new TelefoneFixo();
		celular.falar();
		
		fixo.falar();
	}

}
