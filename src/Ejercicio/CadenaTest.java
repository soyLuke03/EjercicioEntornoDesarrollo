package Ejercicio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CadenaTest {

	
	@ValueSource(ints = {11,111})
	@ParameterizedTest
	void testEsCapicua(int valor) {
		Cadena chain = new Cadena(valor);
		
		assertTrue(chain.esCapicua());
	}
	
	@Test
	void testEsCapicuaNull() {
		Cadena chain = new Cadena(null);
		
		assertFalse(chain.esCapicua());
	}
	
	@Test
	void testEsCapicuaLetra() {
		Cadena chain = new Cadena("121");
		
		assertFalse(chain.esCapicua());
	}
	
	@Test
	void testEsCapicuaLetraLetra() {
		Cadena chain = new Cadena("AbcbA");
		
		assertFalse(chain.esCapicua());
	}

	@Test
	void testEsCapicuaDouble() {
		Cadena chain = new Cadena(12.21);
		chain.esCapicua();
		assertTrue(chain.esCapicua());
	}
	@Test
	void testEsCapicuaDouble2() {
		Cadena chain = new Cadena(12.1);
		
		assertFalse(chain.esCapicua());
	}

	
	
	
	@ValueSource(strings = {"Ana","Anna","Josebabesoj"})
	@ParameterizedTest
	void testEsAnagrama(String cadena) {
		Cadena chain = new Cadena(cadena);
		
		assertTrue(chain.esAnagrama());
		
	}
	
	@Test
	void testEsAnagramaNull() {
		Cadena chain = new Cadena(null);
		
		assertFalse(chain.esAnagrama());
	}
	
	@Test
	void testEsAnagramaVacio() {
		Cadena chain = new Cadena("");
		
		assertFalse(chain.esAnagrama());
	}
	
	@Test
	void testEsAnagramaEspacios() {
		Cadena chain = new Cadena("  ");
		
		assertFalse(chain.esAnagrama());
	}
	
	@Test
	void testEsAnagramaCasosEspeciales() {
		Cadena chain = new Cadena(" a ");
			
		assertFalse(chain.esAnagrama());
	}
	
	@Test
	void testEsAnagramaCasosEspeciales2() {
		Cadena chain = new Cadena("a cbbca");
			
		assertFalse(chain.esAnagrama());
	}
	
	
	

}
