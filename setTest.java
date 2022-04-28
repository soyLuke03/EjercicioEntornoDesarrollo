package Ejercicio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class setTest {

	@Test
	void sizeSetTest() {
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		assert(set.size()==1);
		
		set.add(23);
		assert(set.size()==2);
		
		set.clear();
		assert(set.size()==0);
	}
	
	@ValueSource(ints = {1,5})
	@ParameterizedTest
	void testSetContains(int valor) {
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		set.add(7);
		
		
		assertTrue(set.contains(valor));
	}
	
	@ValueSource(ints = {10,5})
	@ParameterizedTest
	void testSetRemove(int valor) {
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(valor);
		
		assertEquals(set.size(),1);
		set.remove(valor);
		assertEquals(set.size(),0);
	}
	
	
	@Test
	void testSetNull() {
		Set<Integer> set = null;

		try {
			set.size();
		} catch (NullPointerException e) {
			assert(true);
		}
	}
	
	
	

}
